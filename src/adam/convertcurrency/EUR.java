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
public class EUR {

    /**
     *
     * @param newCode
     * @param value
     */

   final Double [] rates = {1.4303, 1.4564, 0.7911, 137.1625, 1.3378, 
       47.5825, 17.6373, 8.2754, 80.7981};
   Double convert;
   Double newCurrency;
   String newSymbol;
    public EUR(String newCode, double value) {

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
             newCurrency = Math.abs(value);
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

