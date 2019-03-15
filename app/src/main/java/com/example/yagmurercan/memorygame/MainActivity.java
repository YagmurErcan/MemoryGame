package com.example.yagmurercan.memorygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView mTextViewP1, mTextViewP2;

    ImageView mImageView_1_1, mImageView_1_2, mImageView_1_3, mImageView_1_4;
    ImageView mImageView_2_1, mImageView_2_2, mImageView_2_3, mImageView_2_4;
    ImageView mImageView_3_1, mImageView_3_2, mImageView_3_3, mImageView_3_4;

    Integer[] cardsArray ={101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    //actual images
    int image_101, image_102, image_103, image_104, image_105, image_106;
    int image_201, image_202, image_203, image_204, image_205, image_206;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;

    int cardNumber = 1;

    int turn = 1;
    int playerPoints = 0;
    int cpuPoint = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewP1 = (TextView) findViewById(R.id.textView_P1);
        mTextViewP2 = (TextView) findViewById(R.id.textView_P2);

        mImageView_1_1 = (ImageView) findViewById(R.id.imageView_1_1);
        mImageView_1_2 = (ImageView) findViewById(R.id.imageView_1_2);
        mImageView_1_3 = (ImageView) findViewById(R.id.imageView_1_3);
        mImageView_1_4 = (ImageView) findViewById(R.id.imageView_1_4);

        mImageView_2_1 = (ImageView) findViewById(R.id.imageView_2_1);
        mImageView_2_2 = (ImageView) findViewById(R.id.imageView_2_2);
        mImageView_2_3 = (ImageView) findViewById(R.id.imageView_2_3);
        mImageView_2_4 = (ImageView) findViewById(R.id.imageView_2_4);

        mImageView_3_1 = (ImageView) findViewById(R.id.imageView_3_1);
        mImageView_3_2 = (ImageView) findViewById(R.id.imageView_3_2);
        mImageView_3_3 = (ImageView) findViewById(R.id.imageView_3_3);
        mImageView_3_4 = (ImageView) findViewById(R.id.imageView_3_4);

        mImageView_1_1.setTag("0");
        mImageView_1_2.setTag("1");
        mImageView_1_3.setTag("2");
        mImageView_1_4.setTag("3");
        mImageView_2_1.setTag("4");
        mImageView_2_2.setTag("5");
        mImageView_2_3.setTag("6");
        mImageView_2_4.setTag("7");
        mImageView_3_1.setTag("8");
        mImageView_3_2.setTag("9");
        mImageView_3_3.setTag("10");
        mImageView_3_4.setTag("11");

        //load card images
        frontOfCardsResources();

        Log.i("LogDeneme", "*************************");

        Collections.shuffle(Arrays.asList(cardsArray));

        //P2 inactive
        mTextViewP2.setTextColor(Color.GRAY);

        mImageView_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(mImageView_1_1, theCard);

            }
        });

        mImageView_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(mImageView_1_2, theCard);

            }
        });

        mImageView_1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(mImageView_1_3, theCard);

            }
        });

        mImageView_1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(mImageView_1_4, theCard);

            }
        });

        mImageView_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(mImageView_2_1, theCard);

            }
        });

        mImageView_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(mImageView_2_2, theCard);

            }
        });

        mImageView_2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(mImageView_2_3, theCard);

            }
        });

        mImageView_2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(mImageView_2_4, theCard);

            }
        });

        mImageView_3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(mImageView_3_1, theCard);

            }
        });

        mImageView_3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(mImageView_3_2, theCard);

            }
        });

        mImageView_3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(mImageView_3_3, theCard);

            }
        });

        mImageView_3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(mImageView_3_4, theCard);

            }
        });

    }

    private void doStuff(ImageView iv, int card){
        if (cardsArray[card] == 101) {
                iv.setImageResource(image_101);
        }   else if(cardsArray[card] == 102){
                iv.setImageResource(image_102);
        }   else if(cardsArray[card] == 103){
                iv.setImageResource(image_103);
        }   else if(cardsArray[card] == 104){
                iv.setImageResource(image_104);
        }   else if(cardsArray[card] == 105){
                iv.setImageResource(image_105);
        }   else if(cardsArray[card] == 106){
                iv.setImageResource(image_106);
        }   else if(cardsArray[card] == 201){
                iv.setImageResource(image_201);
        }   else if(cardsArray[card] == 202){
                iv.setImageResource(image_202);
        }   else if(cardsArray[card] == 203){
                iv.setImageResource(image_203);
        }   else if(cardsArray[card] == 204){
                iv.setImageResource(image_204);
        }   else if(cardsArray[card] == 205){
                iv.setImageResource(image_205);
        }   else if(cardsArray[card] == 206){
                iv.setImageResource(image_206);
        }

        //check selected image and save it

        if(cardNumber == 1){
            firstCard = cardsArray[card];
            if(firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        } else if(cardNumber == 2){
            secondCard = cardsArray[card];
            if(secondCard > 200){
               secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            mImageView_1_1.setEnabled(false);
            mImageView_1_2.setEnabled(false);
            mImageView_1_3.setEnabled(false);
            mImageView_1_4.setEnabled(false);
            mImageView_2_1.setEnabled(false);
            mImageView_2_2.setEnabled(false);
            mImageView_2_3.setEnabled(false);
            mImageView_2_4.setEnabled(false);
            mImageView_3_1.setEnabled(false);
            mImageView_3_2.setEnabled(false);
            mImageView_3_3.setEnabled(false);
            mImageView_3_4.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check selected images are equal or not
                    Log.i("LogDeneme", "***********************calculate metodunu gördü*************************");
                    calculate();



                }
            } , 1000);

        }

    }

    private void calculate(){

        Log.i("LogDeneme", "***************calculate metoduna girdi******************");
        //images are equal, add point
        if(firstCard == secondCard){
            Log.i("LogDeneme", "***********************kartlar eşit*************************");
            if(clickedFirst == 0){
                mImageView_1_1.setVisibility(View.INVISIBLE);
                Log.i("LogDeneme", "***********************1. kartı sil(ilk seçilen)*************************");
            } else if (clickedFirst == 1){
                mImageView_1_2.setVisibility(View.INVISIBLE);
                Log.i("LogDeneme", "***********************2. kartı sil(ilk seçilen)*************************");
            } else if (clickedFirst == 2){
                mImageView_1_3.setVisibility(View.INVISIBLE);
                Log.i("LogDeneme", "***********************3. kartı sil(ilk seçilen)*************************");
            } else if (clickedFirst == 3){
                mImageView_1_4.setVisibility(View.INVISIBLE);
                Log.i("LogDeneme", "***********************4. kartı sil(ilk seçilen)*************************");
            } else if (clickedFirst == 4){
                mImageView_2_1.setVisibility(View.INVISIBLE);
                Log.i("LogDeneme", "***********************5. kartı sil(ilk seçilen)*************************");
            } else if (clickedFirst == 5){
                mImageView_2_2.setVisibility(View.INVISIBLE);
                Log.i("LogDeneme", "***********************6. kartı sil(ilk seçilen)*************************");
            } else if (clickedFirst == 6){
                mImageView_2_3.setVisibility(View.INVISIBLE);
                Log.i("LogDeneme", "***********************7. kartı sil(ilk seçilen)*************************");
            } else if (clickedFirst == 7){
                mImageView_2_4.setVisibility(View.INVISIBLE);
                Log.i("LogDeneme", "***********************8. kartı sil(ilk seçilen)*************************");
            } else if (clickedFirst == 8){
                mImageView_3_1.setVisibility(View.INVISIBLE);
                Log.i("LogDeneme", "***********************9. kartı sil(ilk seçilen)*************************");
            } else if (clickedFirst == 9){
                mImageView_3_2.setVisibility(View.INVISIBLE);
                Log.i("LogDeneme", "***********************10. kartı sil(ilk seçilen)*************************");
            } else if (clickedFirst == 10){
                mImageView_3_3.setVisibility(View.INVISIBLE);
                Log.i("LogDeneme", "***********************11. kartı sil(ilk seçilen)*************************");
            } else if (clickedFirst == 11){
                mImageView_3_4.setVisibility(View.INVISIBLE);
                Log.i("LogDeneme", "***********************12. kartı sil(ilk seçilen)*************************");
            }

            if(clickedSecond == 0){
                mImageView_1_1.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1){
                mImageView_1_2.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2){
                mImageView_1_3.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3){
                mImageView_1_4.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4){
                mImageView_2_1.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5){
                mImageView_2_2.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6){
                mImageView_2_3.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7){
                mImageView_2_4.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8){
                mImageView_3_1.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9){
                mImageView_3_2.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10){
                mImageView_3_3.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11){
                mImageView_3_4.setVisibility(View.INVISIBLE);
            }

            //add points
            if (turn == 1){
                playerPoints++;
                mTextViewP1.setText("P1: " + playerPoints);
            } else if (turn == 2){
                cpuPoint++;
                mTextViewP2.setText("P2: " + cpuPoint);
            }
        } else {
            Log.i("LogDeneme", "***********************kartlar eşit değil*************************");

            mImageView_1_1.setImageResource(R.drawable.image_back);
            mImageView_1_2.setImageResource(R.drawable.image_back);
            mImageView_1_3.setImageResource(R.drawable.image_back);
            mImageView_1_4.setImageResource(R.drawable.image_back);
            mImageView_2_1.setImageResource(R.drawable.image_back);
            mImageView_2_2.setImageResource(R.drawable.image_back);
            mImageView_2_3.setImageResource(R.drawable.image_back);
            mImageView_2_4.setImageResource(R.drawable.image_back);
            mImageView_3_1.setImageResource(R.drawable.image_back);
            mImageView_3_2.setImageResource(R.drawable.image_back);
            mImageView_3_3.setImageResource(R.drawable.image_back);
            mImageView_3_4.setImageResource(R.drawable.image_back);

            //change player
            if (turn == 1){
                turn = 2;
                mTextViewP1.setTextColor(Color.GRAY);
                mTextViewP2.setTextColor(Color.BLACK);
            } else if (turn == 2){
                turn = 1;
                mTextViewP2.setTextColor(Color.GRAY);
                mTextViewP1.setTextColor(Color.BLACK);
            }
        }

        mImageView_1_1.setEnabled(true);
        mImageView_1_2.setEnabled(true);
        mImageView_1_3.setEnabled(true);
        mImageView_1_4.setEnabled(true);
        mImageView_2_1.setEnabled(true);
        mImageView_2_2.setEnabled(true);
        mImageView_2_3.setEnabled(true);
        mImageView_2_4.setEnabled(true);
        mImageView_3_1.setEnabled(true);
        mImageView_3_2.setEnabled(true);
        mImageView_3_3.setEnabled(true);
        mImageView_3_4.setEnabled(true);

        //check game over?
        checkEnd();
    }

    private void checkEnd(){
        if (mImageView_1_1.getVisibility() == View.INVISIBLE &&
                mImageView_1_2.getVisibility() == View.INVISIBLE &&
                mImageView_1_3.getVisibility() == View.INVISIBLE &&
                mImageView_1_4.getVisibility() == View.INVISIBLE &&
                mImageView_2_1.getVisibility() == View.INVISIBLE &&
                mImageView_2_2.getVisibility() == View.INVISIBLE &&
                mImageView_2_3.getVisibility() == View.INVISIBLE &&
                mImageView_2_4.getVisibility() == View.INVISIBLE &&
                mImageView_3_1.getVisibility() == View.INVISIBLE &&
                mImageView_3_2.getVisibility() == View.INVISIBLE &&
                mImageView_3_3.getVisibility() == View.INVISIBLE &&
                mImageView_3_4.getVisibility() == View.INVISIBLE ) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("GAME OVER!\nP1: " + playerPoints + "\nP2: " + cpuPoint)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();

                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();


        }
    }

    private void frontOfCardsResources(){
        image_101 = R.drawable.image_101;
        image_102 = R.drawable.image_102;
        image_103 = R.drawable.image_103;
        image_104 = R.drawable.image_104;
        image_105 = R.drawable.image_105;
        image_106 = R.drawable.image_106;
        image_201 = R.drawable.image_201;
        image_202 = R.drawable.image_202;
        image_203 = R.drawable.image_203;
        image_204 = R.drawable.image_204;
        image_205 = R.drawable.image_205;
        image_206 = R.drawable.image_206;
    }
}
