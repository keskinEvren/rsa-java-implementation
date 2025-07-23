# RSA Java Implementation

A Java implementation of the RSA encryption algorithm, providing both encryption and decryption functionality.

## Features

- RSA key pair generation
- Encryption of messages using public key
- Decryption of messages using private key
- Simple menu-driven interface

## Files

- `RSA.java` - Core RSA algorithm implementation
- `Menu.java` - User interface handling
- `Menu.form` - GUI layout file (if applicable)
- `TestRSA.java` - Test cases for the RSA implementation

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Apache Ant (for building with provided build.xml)

### Building and Running

1. Clone the repository:
   ```bash
   git clone https://github.com/username/java-rsa-cryptosystem.git
2. Build the project:
   ```bash
   ant build
3. Run the application:
   ```bash
   ant run
  Or directly:
   ```bash
   java -cp build/classes com.yourpackage.Main
   ```

### Usage
- Run the program
- Select to generate new RSA keys or use existing ones
- Choose encryption or decryption
- Enter your message or ciphertext
- View results

### Security Notes
- This implementation is for educational purposes
- For production use, consider using Java's built-in crypto libraries
- Always protect your private keys
