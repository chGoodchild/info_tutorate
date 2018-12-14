// https://en.wikipedia.org/wiki/Generics_in_Java

public class Tuple {
	public static void main(String [] args) {
		
		MyTuple<String, Double, Double> tuple = new MyTuple<String, Double, Double>();
		MyTuple<String, Double, Double> tuple2 = new MyTuple<String, Double, Double>();
		
		MyTupleList<String, Double, Double> tupleList = new MyTupleList<String, Double, Double>();
		
		tuple.setA("Hallo");
		tuple.setB(2.0);
		tuple.setC(3.0);
				
		tuple2.setA("Ciao");
		tuple2.setB(4.0);
		tuple2.setC(2.0);

		System.out.println(tuple.getA());
		System.out.println(tuple.getB());
		System.out.println(tuple.getC());
		
		System.out.println(tuple.toString());
		
		tupleList.addTuple(tuple);
		tupleList.addTuple(tuple2);
		
		tupleList.showTuplelist();
	}
}
