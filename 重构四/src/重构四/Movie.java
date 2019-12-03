package 重构四;

public class Movie {
	public static final int childrens = 2;//儿童片
    public static final int regular = 0;//普通片
    public static final int new_release = 1;//新片
    private String title;//片名
    private int priceCode;//价格
    public Movie(String title, int priceCode){
  	  this.title = title;
  	  this.priceCode = priceCode;
    }
    public int getPriceCode(){
  	  return priceCode;
    }
    public void setPriceCode(int arg){
  	  priceCode = arg;
    }
    public String getTitle(){
  	  return title;
    }
}
