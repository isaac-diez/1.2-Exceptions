📄**Description**

- #### English
    Create a class called "Product" with attributes name and price, and another class called "Sale". This class has as its attribute a collection of products and the total price of the sale.
    
    The "Sale" class has a method called totalPrice() that throws the custom exception "EmptySaleException" and shows on screen "In order to make a sale, add some products to the list" if the product collection is empty. If the collection has products, then you have to run through the collection and save the sum of all the prices of the products on the grand total price of the sale.
    
    The custom exception "EmptySaleException" must be the subclass of the class Exception. At its constructor, you have to pass the message “In order to make a sale, add some products to the list” and when the exception is caught, it must be shown on the screen with the method getMessage().
    
    Write the necessary code to generate and catch an "IndexOutOfBoundsException" exception.


- #### Català

    Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda". Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.
    
    La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada "VendaBuidaException" i mostra per pantalla “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.
    
    L’excepció personalitzada "VendaBuidaException" ha de ser filla de la classe Exception. Al seu constructor li hem de passar el missatge  “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.
    
    Escriu el codi necessari per a generar i capturar una excepció de tipus "IndexOutOfBoundsException".


💻**Stack used:**
Project created with:
- Java v.21.
- Maven v.4.0.0.
- IDE IntelliJ Idea v. 24.3.1.1

📋**Requirements:**
No specific requirement but the Java and Maven version or newer.

🛠️**Installation:**
- Clone this repo: -> [git clone](https://github.com/isaac-diez/1.2-Exceptions.git)
- Access to the project [folder](https://github.com/isaac-diez/1.2-Exceptions/tree/master/src/Level1)


▶️**Execution:** No specific instruction.

🌐**Deployment:** N/A.

🤝**Contributions:**

Contributions are welcome! Please follow the following steps to contribute:

- Fork the repository.
- Create a new: git checkout branch -b feature/News.
- Make your changes and commit them: git commit - 'Add New Functionality'.
- Upload the changes to your branch: git push feature/News.
- Do a pull request.