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

   final Double [] rates = {0.0177, 0.0179, 0.0123, 0.0099, 1.6866, 
       0.0165, 0.5927, 0.215, 0.1012};
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
