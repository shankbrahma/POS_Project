package pos.dao;

import org.springframework.stereotype.Repository;
import pos.pojo.OrderPojo;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

//Repository for order
@Repository
public class OrderDao extends AbstractDao{

    //Add order
    @Transactional
    public int insert(OrderPojo orderPojo){
        em().persist(orderPojo);
        return orderPojo.getId();
    }

    @Transactional
    public void update(int id,OrderPojo orderPojo){

    }

    //Retrieve an Order by id
    @Transactional
    public OrderPojo select(int id) {
        return em().find(OrderPojo.class, id);
    }

    //Retrieve all Orders
    @Transactional
    public List<OrderPojo> selectAll() {
        String select_all = "select p from OrderPojo p";
        TypedQuery<OrderPojo> query = getQuery(select_all,OrderPojo.class);
        return query.getResultList();
    }

    @Transactional
    public List<OrderPojo> getByDate(LocalDateTime startDate, LocalDateTime endDate){
        String selectByDate = "select p from OrderPojo p where datetime between :startDate and :endDate";
        TypedQuery<OrderPojo> query = getQuery(selectByDate,  OrderPojo.class);
        query.setParameter("startDate",startDate);
        query.setParameter("endDate",endDate);
        return query.getResultList();
    }
}
