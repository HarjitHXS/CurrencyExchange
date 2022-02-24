
/*
  @author Harjit Singh
   This class Manager to calculate the currency exchange and let
   the user decided much and what currency they want to exchange
 */
public class Manager {

    public Manager(){

    }
    public double getChange(double amount, String cur, String curEx){
        double turn = 0;
        if(cur.equals("US")){                    //One
            if(curEx.equals("Rupee")){
            turn = amount * 70;
            }
            else if(curEx.equals("Pound")){
                turn = amount * 0.78;
            }
            else if(curEx.equals("Euro")){
                turn = amount * 0.87;
            }
            else if(curEx.equals("Yen")){
                turn = amount * 111.087;
            }
            else if(curEx.equals("Ringgit")){
                turn = amount * 4.17;
            }
            else if(curEx.equals("Dirham")){
                turn = amount * 3.37;
            }
        }
        else if(cur.equals("Rupee")){               //two
            if(curEx.equals("US")){
                turn = amount / 70;
            }
            else if(curEx.equals("Pound")){
                turn = amount / 88;
            }
            else if(curEx.equals("Euro")){
                turn = amount / 80;
            }
            else if(curEx.equals("Yen")){
                turn = amount / 0.65;
            }
            else if(curEx.equals("Ringgit")){
                turn = amount / 16;
            }
            else if(curEx.equals("Dirham")){
                turn = amount / 0.049;
            }
        }
        else if(cur.equals("Pound")){           //three
            if(curEx.equals("Rupee")){
                turn = amount * 88;
            }
            else if(curEx.equals("US")){
                turn = amount * 1.26;
            }
            else if(curEx.equals("Euro")){
                turn = amount * 1.10;
            }
            else if(curEx.equals("Yen")){
                turn = amount * 156.94;
            }
            else if(curEx.equals("Ringgit")){
                turn = amount * 5.29;
            }
            else if(curEx.equals("Dirham")){
                turn = amount * 4.99;
            }
        }
        else if(cur.equals("Euro")){           //four
            if(curEx.equals("Rupee")){
                turn = amount * 80;
            }
            else if(curEx.equals("US")){
                turn = amount * 1.14;
            }
            else if(curEx.equals("Pound")){
                turn = amount * 0.90;
            }
            else if(curEx.equals("Yen")){
                turn = amount * 127.32;
            }
            else if(curEx.equals("Ringgit")){
                turn = amount * 4.78;
            }
            else if(curEx.equals("Dirham")){
                turn = amount * 4.18;
            }
        }
        else if(cur.equals("Yen")){        //fifth
            if(curEx.equals("Rupee")){
                turn = amount * 16.8;
            }
            else if(curEx.equals("US")){
                turn = amount * 0.0087;
            }
            else if(curEx.equals("Euro")){
                turn = amount * 0.209;
            }
            else if(curEx.equals("Pound")){
                turn = amount * 0.0064;
            }
            else if(curEx.equals("Ringgit")){
                turn = amount * 26.63;
            }
            else if(curEx.equals("Dirham")){
                turn = amount * 0.032;
            }
        }
        else if(cur.equals("Dirham")){         //sixth
            if(curEx.equals("Rupee")){
                turn = amount * 20.41;
            }
            else if(curEx.equals("Pound")){
                turn = amount * 0.20;
            }
            else if(curEx.equals("Euro")){
                turn = amount * 0.24;
            }
            else if(curEx.equals("Yen")){
                turn = amount * 31.42;
            }
            else if(curEx.equals("Ringgit")){
                turn = amount * 1.14;
            }
            else if(curEx.equals("Dollar")){
                turn = amount * 0.27;
            }
        }
        return turn;
    }
    public static void main(String[] args) {
        Manager m = new Manager();
        String one = "Yen";
        String two = "US";
        double a = 132;

        double q = m.getChange(a, one,two);
         System.out.println(q);
    }
}

