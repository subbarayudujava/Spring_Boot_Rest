package com.nit.upi;

import java.util.Random;

public class UpiPaments {
   public String upiPaments(String upiAmount,Double amount) {
	   return "Amount  done::"+amount+"paid";
   }
   public double checkBalance() {
	   return new Random().nextDouble(120000.00);
   }
}
