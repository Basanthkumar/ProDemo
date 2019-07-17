package Package_1;

interface Interface2
{
	// for markerUpInterface the interface body must be blank
}

class ImplemementingMarkerUpInterface
{
	public void printUsingMarkerInterface(){
		System.out.println("I am an interface method implemented using Class");
	}
}


public class ImplementingMarkerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplemementingMarkerUpInterface obj1 = new ImplemementingMarkerUpInterface();
		// When the above object is created it will create instance of Interface too 
		if(obj1 instanceof Interface2 )
		{
			obj1.printUsingMarkerInterface();
		}else
		{
			System.out.println("I am  not interface of P");
		}
	}

}
