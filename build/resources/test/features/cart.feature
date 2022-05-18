Feature: Cart Operations
Scenario Outline: Add a product 
Given that "julian" has opened the ecomerce
When  he selects the product from the section

| subcategory        |product       | 
| <user_subcategory> |<user_product>| 

And he adds the product to the cart with 
|  size   |quantity         | 
| <size>  |<quantity>       |

Then he should see the added product in the cart

Examples:
| user_subcategory   |user_product             | size |quantity |
| Paints             |Light Speed Yellow Paint | 2.5l |4        |
| Juices             |Apple Juice              | 1l   |3        |
| Alcohol            |Red Wine                 |      |         |  









 






