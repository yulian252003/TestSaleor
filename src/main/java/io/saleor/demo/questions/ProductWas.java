package io.saleor.demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
//import net.serenitybdd.screenplay.waits.WaitUntil;
//import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static io.saleor.demo.ui.CartPage.*;

public class ProductWas implements Question<Boolean>
{
@Override
public Boolean answeredBy(Actor actor)
{ 
	if(!actor.recall("chosen_subcategory").equals("Alcohol"))
	 {
		actor.attemptsTo(
				
				Ensure.that(PRODUCT_NAME_IN_CART).hasText(actor.recall("chosen_product")),
				Ensure.that(PRODUCT_PRICE_IN_CART).hasText(actor.recall("price")),
				Ensure.that(PRODUCT_SIZE_IN_CART).hasText(actor.recall("chosen_size"))				
				);		
     } 
	     else
     {
	     actor.attemptsTo(
			Ensure.that(PRODUCT_NAME_IN_CART).hasText(actor.recall("chosen_product")),
			Ensure.that(PRODUCT_PRICE_IN_CART).hasText(actor.recall("price"))
			
			);
     }
	return true;
}


	public static ProductWas Added()
	{
		return new ProductWas();
	}
}
