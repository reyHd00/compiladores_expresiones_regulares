/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores;

/**
 *
 * @author reyna
 */
public class eliminaVocales {

    public static void main(String[] args) {
        String sms = "Happy Thanksgiving to all--even the haters and losers!";
        String e = sms.replaceAll("[aeiouAEIOU]", "");
        System.out.println(sms);
        System.out.println(e);
    }
}
