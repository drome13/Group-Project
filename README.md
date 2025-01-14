# 2045-group-assignment-drome13 Banker Application

---
Design Document

David Rome, Vyviene Spaulding, Dylan Mullarkey

## Introduction

Fulfill all of your banking needs with the Banker program! With this program you can:
- Create various account types (Savings, Checking, CertificateOfDeposit)
- Create multiple accounts
-	Determine the period for your account
- Display your account balance
-	Withdraw money from your accounts

## Class Diagram

![BankerClassDiagram](https://user-images.githubusercontent.com/113064920/205458161-b3fece66-a4b4-4b97-b377-4c45c87d8db5.png)

## Class Diagram Description

**Banker:** The main class. Allows user to create a bank account with an account name and type. Display balance and withdraw money.  Get an interest report

**Account:** Noun class that represents an account

**Savings:** Noun class that extends **Account**, represents a savings account

**Checking:** Noun class that extends **Account**, represents a checking account

**CertificateOfDeposit:** Noun class that extends **Account**, represents a Certificate Of Deposit account
