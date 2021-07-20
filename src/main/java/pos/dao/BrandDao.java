package pos.dao;

import org.springframework.stereotype.Repository;
import pos.pojo.BrandPojo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

//Repository for brand
@Repository
public class BrandDao extends AbstractDao{

	
    private static String deleteById = "delete from BrandPojo p where id=:id";

    //Insert into table
    @Transactional
    public void insert(BrandPojo brandPojo){
        em().persist(brandPojo);
    }

    //Retrieve a brand pojo
    @Transactional
    public BrandPojo select(int id){
        return em().find(BrandPojo.class,id);
    }

    //Retrieve all brand pojo
    @Transactional
    public List<BrandPojo> selectAll() {
        String selectAll = "select p from BrandPojo p";
        TypedQuery<BrandPojo> query = getQuery(selectAll,  BrandPojo.class);
        //TODO
        if(query == null){
            return new ArrayList<>();
        }
        return query.getResultList();
    }

    //Update a brand with given brandId
    @Transactional
    public void update(int id,BrandPojo brandPojo) {
        BrandPojo brandPojo1= em().find(BrandPojo.class, id);
        brandPojo1.setBrand(brandPojo.getBrand());
        brandPojo1.setCategory(brandPojo.getCategory());
        em().merge(brandPojo1);
    }

    @Transactional
    //Retrieve brand pojo based in brand and category
    //TODO rename
    public List<BrandPojo> getIdFromBrandCategory(String brand, String category){
        String selectBrandCategory = "select p from BrandPojo p where brand=:brand and category=:category";
        TypedQuery<BrandPojo> query = getQuery(selectBrandCategory, BrandPojo.class);
        query.setParameter("brand",brand);
        query.setParameter("category",category);
        return query.getResultList();
    }
    
    @Transactional
    public int delete(int id) {
		Query query = em().createQuery(deleteById);
		query.setParameter("id", id);
		return query.executeUpdate();
	}
}
