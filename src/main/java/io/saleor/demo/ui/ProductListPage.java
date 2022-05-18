package io.saleor.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductListPage 
{
	public static final Target PRODUCT = Target.the("Label Product").locatedBy("//*[@id=\"__next\"]//p[.='{0}']");
}
