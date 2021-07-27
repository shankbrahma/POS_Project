package pos.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pos.pojo.BrandPojo;

public class BrandServiceTest extends AbstractUnitTest{

		
    //test the addition of a brand
    @Test
    public void testAdd() throws ApiException {
        BrandPojo brandPojo = new BrandPojo();
        brandPojo.setBrand(" Apple ");
        brandPojo.setCategory(" Personal computer ");
        brandService.add(brandPojo);
        BrandPojo brandPojo1=brandService.get(brandPojo.getId());
        assertEquals(brandPojo1.getBrand(),brandPojo1.getBrand());
        assertEquals(brandPojo1.getCategory(),brandPojo1.getCategory());
    }

    //test the exception thrown is correct or not
    @Test(expected = ApiException.class)
    public void testInvalid() throws ApiException{
        BrandPojo brandPojo = new BrandPojo();
        brandPojo.setBrand("");
        brandPojo.setCategory("");
        brandService.add(brandPojo);
    }

//	@Test()
//	public void testUpdate() throws Exception{
////		BrandPojo brandpojo=getBrandPojo();
//		BrandPojo brandPojo2=getBrandPojo();
////		brandPojo2.setBrand("mango");
////		brandPojo2.setCategory("fruits");
//		brandService.update(brandPojoList.get(1).getId(), brandPojo2);
//		assertEquals(brandPojoList.get(1).getBrand(),brandPojo2.getBrand());
//	}
//	
    //test the normalization function
    @Test
    public void testNormalize() {
        BrandPojo brandPojo = new BrandPojo();
        brandPojo.setBrand(" Apple ");
        BrandService.normalize(brandPojo);
        assertEquals("apple", brandPojo.getBrand());
    }
    
//    private BrandPojo getBrandPojo() {
//        BrandPojo brandPojo = brandPojoList.get(1);
//        brandPojo.setId(brandPojoList.get(1).getId());
//        brandPojo.setBrand(" apple ");
//        brandPojo.setCategory("fruits");
//        return brandPojo;
//    }
}