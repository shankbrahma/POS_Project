package pos.dao;

import org.springframework.stereotype.Repository;
import pos.pojo.OrderItemPojo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class OrderItemDao extends AbstractDao{

    @PersistenceContext
    private EntityManager em;

    //Add orderItem
    @Transactional
    public void insert(OrderItemPojo orderItemPojo){
        em.persist(orderItemPojo);
//        Query query=em.createNativeQuery("INSERT INTO OrderItemPojo2 SELECT * FROM OrderItemPojo");
//        query.executeUpdate();
    }

    //Select orderItem by id
    public OrderItemPojo select(int id){
        return em.find(OrderItemPojo.class, id);
    }

    //Select all orderItems
    //TODO
    public List<OrderItemPojo> selectAll() {
        String select_all = "select p from OrderItemPojo p";
        TypedQuery<OrderItemPojo> query = getQuery(select_all,  OrderItemPojo.class);
        return query.getResultList();
    }

    //Get orderItems for same orderId
    //TODO
    public List<OrderItemPojo> getFromOrderId(int orderId){
        String select_from_orderId = "select p from OrderItemPojo p where orderId=:orderId";
        TypedQuery<OrderItemPojo> query = getQuery(select_from_orderId,  OrderItemPojo.class);
        query.setParameter("orderId", orderId);
        return query.getResultList();
    }

}
