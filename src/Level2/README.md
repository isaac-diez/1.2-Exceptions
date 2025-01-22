📄**Description**

- #### English
Create a class called “Input”. This class should be used to handle the different exceptions that may appear in Java when entering keyboard data using the Scanner class.

The first thing to do is to create an object of the Scanner class and, from there, create static methods to read the different types of data from the keyboard.

Important

    **Important**
    It's important that if there is an exception in any method, we deal with it and ask the user again until it is entered correctly. For example, if you enter a float with a period instead of a comma, you should display “Formatting error”. Until the user enters a well-formatted float, you should keep asking for the data.

All methods receive a string with the message the user wants to display, for example: “Enter your age”, and return to the user timely information in each method, for example: a byte with the user's age.

Methods to implement the “InputMismatchException” class:

* public static byte readByte(String message);
* public static int readInt(String message);
* public static float readFloat(String message);
* public static double readDouble(String message);

Methods to implement an exception tailored to the Exception class:

* public static char readChar(String message);
* public static String readString(String message);
* public static boolean readYesNo(String message), if the user inputs "y", "true" is returned and if the user inputs "n", "false" is returned.


- #### Català

Crea una classe anomenada "Entrada". Aquesta classe ha de servir per controlar les diferents excepcions que poden aparèixer en Java a l’hora d’introduir dades per teclat utilitzant la classe Scanner.

El primer que s’ha de fer és instanciar un objecte de la classe Scanner i a partir d’aquí, crear mètodes estàtics per llegir els diferents tipus de dades des del teclat.

    **Important**
    
    És important que si en algun mètode salta una excepció, la tractem i tornem a demanar la dada a l’usuari/ària fins que aquesta estigui ben introduïda. Per exemple: Si introdueix un float amb un punt en lloc d'una coma, ha de mostrar “Error de format”. Fins que l’usuari/ària no introdueix un float ben format ha de seguir demanant la dada.
    
Tots els mètodes reben un String amb el missatge que es vol mostrar a l’usuari/ària, per exemple: “Introdueix la teva edat”, i retornen la dada oportuna introduïda per l’usuari/ària en cada mètode, per exemple: un byte amb l’edat de l’usuari/ària.
    
Mètodes a implantar capturant l’excepció de la classe "InputMismatchException":

* public static byte readByte(String message);
* public static int readInt(String message);
* public static float readFloat(String message);
* public static double readDouble(String message);

Mètodes a implantar capturant una excepció personalitzada de la classe Exception:

* public static char readChar(String message);
* public static String readString(String message);
* public static boolean readYesNo(String message), si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari/ària introdueix “n”, retorna “false”.


💻**Stack used:**
Project created with:
- Java v.21.
- Maven v.4.0.0.
- IDE IntelliJ Idea v. 24.3.1.1

📋**Requirements:**
No specific requirement but the Java and Maven version or newer.

🛠️**Installation:**
- Clone this repo: -> [git clone](https://github.com/isaac-diez/IT-Academy-Java.git)
- Access to the project folder: cd IT-Academy-Java/1.2-Exceptions-Nivell2
- **IMPORTANT: checkout branch MASTER**

▶️**Execution:** No specific instruction.

🌐**Deployment:** N/A.

🤝**Contributions:**

Contributions are welcome! Please follow the following steps to contribute:

- Fork the repository.
- Create a new: git checkout branch -b feature/News.
- Make your changes and commit them: git commit - 'Add New Functionality'.
- Upload the changes to your branch: git push feature/News.
- Do a pull request.