package �ع���;

public class Movie {
	public static final int childrens = 2;//��ͯƬ
    public static final int regular = 0;//��ͨƬ
    public static final int new_release = 1;//��Ƭ
    private String title;//Ƭ��
    private int priceCode;//�۸�
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
