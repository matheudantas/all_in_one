1. Conhecendo o Java

>Características:
   - compilada
   - interpretada
   - fortemente tipada
   - linguagem de alto nível
   - executada em uma máquina virtual (JVM)



2. Entendendo a JVM
  - É uma máquina virtual responsável pela tradução dos ByteCodes oriundos do compilador Javac (Java Compiler) em código de máquina de cada sistema operacional


> Características:
   - execução de pilhas
   - gerenciamento de memória
   - gerenciamento de threads
   - otimização de código (Compilação de código *Justin in Time* - JIT)
   - Garbage Collector (GC)

### JRE X  JDK
    - **JRE** (Java Runtime Environment) - responsável por executar os programas em JAVA
    - **JDK** (Java Development  Kit) - utilitários que permite o desenvolvimento de programas em Java. Já possui a JVM para executar os programas


# Os tipos de plataforma:
  - Java SE (Java Standard Edition) 
  - Java EE (Java Enterprise Edition)
  - java ME (Java Micro Edition)

### Quais as implementações no Java SE?
- OpenJDK
- Orakle JDK
- AdoptOpenJDK
- Amazon Corretto
- GraalVM CE
- Azul Zulu


## Instalando a JVM

```bash
sudo apt install curl
```
```bash
curl -sL https://github.com/shyiko/jabba/raw/master/install.sh | bash && . ~/.jabba/jabba.sh
```
*fonte: https://github.com/shyiko/jabba*

```bash
jabba ls-remote
jabba install openjdk@1.11
jabba use openjdk@1.11
java -version
```

### Compilar

```bash
javac -d target/ -sourcepath src/ src/commom/MyFirstProgram.java
```

### Executar

```bash
cd target/
java commom.MyFirstProgram
```