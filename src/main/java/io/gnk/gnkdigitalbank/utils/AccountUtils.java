package io.gnk.gnkdigitalbank.utils;

import java.time.Year;

public class AccountUtils {

    public  static final  String ACCOUNT_EXISTS_CODE = "001";
    public  static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created!";
    public static final  String ACCOUNT_CREATION_SUCCESS = "002";
    public  static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created!";
    public static final String ACCOUNT_NOT_EXIST_CODE = "003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE = "User with the provided Account Number does not exist";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_SUCCES = "User Account Found";
    public static final String ACCOUNT_CREDITED_SUCCES = "005";
    public static final String ACCOUNT_CREDITED_SUCCES_MESSAGE = "User Account has credited successfully";
    public static final String INSUFFICIENT_BALANCE_CODE = "006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE ="Insufficient Balance";
    public static final String ACCOUNT_DEBITED_SUCCESS ="007";
    public static final  String ACCOUNT_DEBITED_MESSAGE = "Account has been successfully debited";
    public static final String TRANSFERT_SUCCESSFUL_CODE = "008";
    public static final  String TRANSFERT_SUCCESSFUL_MESSAGE = "Transfert successful";





    public static String generateAccountNumber(){
        /**
         * 2023 * randomSixDigits
         */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //Nous générons des numéros aléatoirement entre le min et le max
        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        //Convertir l'annee courante et le numero aléatoirement obtenu en chaines de caractere et les concatener

        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();

        return  accountNumber.append(year).append(randomNumber).toString();
    }
}
