public class Bill {
    public static void main (String[] args){
        int pizzaprice=200;
        int puffprice=40;
        int pepsiprice=120;


        int numofprizzas=5;
        int numofpuffs=6;
        int numofpepsi=2;

        int totalpizzacost=numofprizzas*pizzaprice;
        int totalpuffcost=numofpuffs*puffprice;
        int totalpepsicost=numofpepsi*pepsiprice;

        int grandtotal=totalpizzacost+totalpuffcost+totalpepsicost;

        System.out.println("bill details:");
        System.out.println("total cost of pizza:"+totalpizzacost);
        System.out.println("total cost of puffs:"+totalpuffcost);
        System.out.println("total cost of pepsi:"+totalpepsicost);
        System.out.println("grand total:"+grandtotal);

    }
}
