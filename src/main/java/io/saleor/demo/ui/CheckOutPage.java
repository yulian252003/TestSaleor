package io.saleor.demo.ui;
import net.serenitybdd.screenplay.targets.Target;

public class CheckOutPage 
{
	public static final Target QUANTITY = Target.the("Label quantity").locatedBy("//input[contains(@type,'number')]");

}
