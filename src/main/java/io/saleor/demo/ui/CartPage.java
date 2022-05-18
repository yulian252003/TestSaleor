package io.saleor.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage
{
	public static final Target PRODUCT_NAME_IN_CART = Target.the("Name of the product in the car").locatedBy("//*[@id=\"__next\"]/div[3]/div/main/div/section/ul/li/div[2]/div/div/div[1]/h3/a");
	public static final Target PRODUCT_PRICE_IN_CART = Target.the("Price of the product in the car").locatedBy("//p[contains(@class,'text-xl')]");
	public static final Target PRODUCT_SIZE_IN_CART = Target.the("Size of the product").locatedBy("//p[contains(@class,'text-gray-700')]");
	
	
}
