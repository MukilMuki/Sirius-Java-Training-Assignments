package day_4.creational;

public class Builder_Pattern_Creational {
	public static void main(String[] args) {
		
		Hotel.BreakFast breakfast=new Hotel.BreakFast.BreakFastPackingDepartment().
				setFood(new IdlyRice(new IdlyDaal())).build();
		System.out.println(breakfast.food.taste());
	}
}
class Hotel{
	class BreakFast{
		Food food;
		public BreakFast(Food food) {
			this.food=food;
		}
		static class BreakFastPackingDepartment{
			Food food;
			public BreakFastPackingDepartment setFood(Food food) {
				this.food=food;
				return this;
			}
			public BreakFast build() {
				return new Hotel().new BreakFast(food);
			}
		}
		@Override
		public String toString() {
			return "BreakFast [food=" + food + "]";
		}
		
	}
}
abstract class Food{
	abstract public String taste();
}
abstract class Rice extends Food{
	
}
abstract class Daal extends Food{
	
}
class IdlyRice extends Rice{
	Food food;
	public IdlyRice() {
		// TODO Auto-generated constructor stub
	}
	public IdlyRice(Food food) {
		this.food=food;
	}
	@Override
	public String taste() {
		if(food==null) {
			return "rice taste..";
		}
		else {
			return "rice taste"+":"+food.taste();
		}
	}
	
}
class IdlyDaal extends Daal{
	Food food;
	public IdlyDaal() {
		// TODO Auto-generated constructor stub
	}
	public IdlyDaal(Food food) {
		this.food=food;
	}
	@Override
	public String taste() {
		if(food==null) {
			return "Daal taste..";
		}
		else {
			return "Daal taste"+":"+food.taste();
		}
	}
}
class VadaDaal extends Daal{
	Food food;
	public VadaDaal() {
		// TODO Auto-generated constructor stub
	}
	public VadaDaal(Food food) {
		this.food=food;
	}
	@Override
	public String taste() {
		if(food==null) {
			return "Vada taste..";
		}
		else {
			return "Vada taste"+":"+food.taste();
		}
	}
}
