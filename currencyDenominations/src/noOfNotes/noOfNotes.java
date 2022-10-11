package noOfNotes;

public class noOfNotes {
	public void counting(int[] A, int amount) {//  where amount is equal to hoe much we want to pay
		int notes[]=new int[A.length];
		int i;
		int sum=0;//sum is used to calculate no of notes
		for(i=0;i<A.length;i++)
		{
			notes[i]=amount/A[i];
			sum=sum+notes[i];
			amount=amount%A[i];
		}
		System.out.println("You have to pay  minimum number of notes with the following denominations in order to complete the payment");
		for(i=0;i<A.length;i++)
		{
			if(notes[i]!=0)
			System.out.println(A[i] + ":" + notes[i]);
		}

	}


}
