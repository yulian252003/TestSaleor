package io.saleor.demo.ui;
import net.serenitybdd.screenplay.targets.Target;
public class ProductDetailsPage 
{
	public static final Target SIZETYPE = Target.the("Type of size").locatedBy("//*[@id=\"__next\"]/div[3]/main/div[2]/select");
	public static final Target SIZE = Target.the("Value of the size").locatedBy("//option[.='{0}']");
	public static final Target ADDBUTTON = Target.the("Add Button").locatedBy("//*[@id=\"__next\"]/div[3]/main/div[2]/button");
    public static final Target PRODUCTPRICEINDETAIL = Target.the("Price without discount").locatedBy(".text-xl");
}
                                                                                                      