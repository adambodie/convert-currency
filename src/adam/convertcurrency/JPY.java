/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adam.convertcurrency;

/**
 *
 * @author Adam Bodie
 */
public class JPY {
    
    /**
     *
     * @param newCode
     * @param value
     */

   final Double [] rates = {0.0105, 0.0106, 0.0073, 0.0058, 0.0098, 
       0.3514, 0.1275, 0.06, 0.5929};
   Double convert;
   Double newCurrency;
   String newSymbol;
    public JPY(String newCode, double value) {

     switch (newCode) {
         case "AUD - Australian Dollar":
             convert = rates[0];
             newCurrency = Math.abs(convert * value);
             newSymbol = "$";
             break;
         case "CAD - Canadian Dollar":
             convert = rates[1];
             newCurrency = Math.abs(convert * value);
             newSymbol = "$";
             break;
         case "EUR - Euro":
             convert = rates[2];
             newCurrency = Math.abs(convert * value);
             newSymbol = "€";
             break;
         case "GBP - British Pound Sterling":
             convert = rates[3];
             newCurrency = Math.abs(convert * value);
             newSymbol = "£";
             break;
         case "JPY - Japanese Yen":
             newCurrency = Math.abs(value);
             newSymbol = "¥";
             break;
         case "USD - US Dollar":
             convert = rates[4];
             newCurrency = Math.abs(convert * value);
             newSymbol = "$";
             break;
         case "RUB - Russian Ruble":
             convert = rates[5];
             newCurrency = Math.abs(convert * value);
             newSymbol = "руб";
             break;
         case "MXN - Mexican Peso":
             convert = rates[6];
             newCurrency = Math.abs(convert * value);
             newSymbol = "$";
             break;
         case "CNY - Chinese Yuan":
             convert = rates[7];
             newCurrency = Math.abs(convert * value);
             newSymbol = "¥";
             break;
         case "INR - Indian Rupee":
             convert = rates[8];
             newCurrency = Math.abs(convert * value);
             newSymbol = "Rs";
             break;             
         default:
     }
    }    
}
