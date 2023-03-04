import javax.swing.JComboBox;

public class Save {
	String top1;
	String top2;
	String top3;
	private JComboBox<String> top4;
	
	public void set4(String top1,String top2,String top3,JComboBox<String> top4) {
		this.top1 =top1;
		this.top2 =top2;
		this.top3 =top3;
		this.top4 =top4;		
	}
	public void set3(String operator2,String operator3,String operator4) {
		this.top1 =operator2;
		this.top2 =operator3;
		this.top3 =operator4;
				
	}
	public void set2(String top1,String top2) {
		this.top1 =top1;
		this.top2 =top2;
				
	}
	public String getTop1() {
		return top1;
	}
	public String getTop2() {
		return top2;
	}
	public String etTop3() {
		return top3;
	}
	public String getTop4() {
		return top4;
	}
	

}
