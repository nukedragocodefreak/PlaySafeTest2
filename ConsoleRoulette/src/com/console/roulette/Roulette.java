package com.console.roulette;

import java.util.Random;
import java.util.Scanner;

public class Roulette
{
   public static void main(String[] args) {

      PlayerList players = new PlayerList();
      Bets bets = new Bets();
      
      players.readFileIntoList("C://temp/players.txt");
      bets.PlayRoulette();
      
       }

   }