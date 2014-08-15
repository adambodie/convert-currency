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
public class INR {
  
    /**
     *
     * @param newCode
     * @param value
     */

   final Double [] rates = {0.0178, 0.0181, 0.0124, 0.0098, 1.7039, 0.0166, 0.5896, 0.2183, 0.1024};
   Double convert;
   Double newCurrency;
   String newSymbol;
    public INR(String newCode, double value) {

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
         case "INR - Indian Rupee":            
             newCurrency = Math.abs(value);
             newSymbol = "Rs";
             break;             
         case "JPY - Japanese Yen":
             convert = rates[4];
             newCurrency = Math.abs(convert * value);
             newSymbol = "¥";
             break;
         case "USD - US Dollar":
             convert = rates[5];
             newCurrency = Math.abs(convert * value);
             newSymbol = "$";
             break;
         case "RUB - Russian Ruble":
             convert = rates[6];
             newCurrency = Math.abs(convert * value);
             newSymbol = "руб";
             break;
         case "MXN - Mexican Peso":
             convert = rates[7];
             newCurrency = Math.abs(convert * value);
             newSymbol = "$";
             break;
         case "CNY - Chinese Yuan":
             convert = rates[8];
             newCurrency = Math.abs(convert * value);
             newSymbol = "¥";
             break;               
         default:
     }
    }     
}
