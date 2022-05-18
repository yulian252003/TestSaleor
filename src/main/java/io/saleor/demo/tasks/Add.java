package io.saleor.demo.tasks;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static io.saleor.demo.ui.ProductDetailsPage.SIZETYPE;
import static io.saleor.demo.ui.ProductDetailsPage.SIZE;
import static io.saleor.demo.ui.ProductDetailsPage.ADDBUTTON;
import static io.saleor.demo.ui.CheckOutPage.QUANTITY;
import static io.saleor.demo.ui.ProductDetailsPage.PRODUCTPRICEINDETAIL;


public class Add implements Task
{
private DataTable data;
	
	public Add(DataTable data)
	{
	this.data=data;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor)
	{
		List<Map<String, String>> values = data.asMaps(String.class,String.class);
		
		if(!actor.recall("chosen_subcategory").equals("Alcohol"))
		{
		actor.attemptsTo(	
				Click.on(SIZETYPE),//click on textbox
				Click.on(SIZE.of(String.valueOf(values.get(0).get("size"))).resolveFor(actor))	
				);
		
		actor.remember("chosen_size", values.get(0).get("size"));
		}
		actor.remember("price", PRODUCTPRICEINDETAIL.resolveFor(actor).getText());
		actor.attemptsTo(
				Click.on(ADDBUTTON),//click on Add to cart
				Enter.theValue(values.get(0).get("quantity")).into(QUANTITY)
				);
		
		
	}
	public static Add theProductWithThe(DataTable data)
	{
		return Tasks.instrumented(Add.class,data);
	}
	
}

