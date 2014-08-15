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
public class AUD {
   /**
     *
     * @param newCode
     * @param value
     */

   final Double [] rates = {1.0161, 0.6976, 0.5587, 95.5496, 0.9321, 
       33.5768, 12.1816, 5.7308, 56.6511};
   Double convert;
   Double newCurrency;
   String newSymbol;
    public AUD(String newCode, double value) {

     switch (newCode) {
         case "AUD - Australian Dollar":
             newCurrency = Math.abs(value);
             newSymbol = "$";
             break;
         case "CAD - Canadian Dollar":
             convert = rates[0];
             newCurrency = Math.abs(convert * value);
             newSymbol = "$";
             break;
         case "EUR - Euro":
             convert = rates[1];
             newCurrency = Math.abs(convert * value);
             newSymbol = "€";
             break;
         case "GBP - British Pound Sterling":
             convert = rates[2];
             newCurrency = Math.abs(convert * value);
             newSymbol = "£";
             break;
         case "JPY - Japanese Yen":
             convert = rates[3];
             newCurrency = Math.abs(convert * value);
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
