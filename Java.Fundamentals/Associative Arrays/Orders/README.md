Orders:


Write a program which keeps the information about products and their prices. Each product has a name, a price, and its quantity. If the product doesn't exist yet, add it with its starting quantity.

If you receive a product that already exists, increases its quantity by the input quantity and if its price is different, replace the price as well.

You will receive products' names, prices, and quantities on new lines. Until you receive the command "buy", keep adding items. When you do receive the command "buy", print the items with their names and the total price of all the products with that name.




Input

· Until you receive "buy", the products come in the format: "{name} {price} {quantity}".

· The product data is always delimited by a single space.




Output

· Print information about each product, following the format: "{productName} -> {totalPrice}"

· Format the average total price to the 2nd decimal place.






Example:



Input:



Beer 2.20 100

IceTea 1.50 50

NukaCola 3.30 80

Water 1.00 500

buy




Output:


Beer -> 220.00 
IceTea -> 75.00 
NukaCola -> 264.00 
Water -> 500.00

