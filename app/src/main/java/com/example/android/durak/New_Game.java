package com.example.android.durak;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class New_Game extends AppCompatActivity {
    String x;
    int xp1,xp2,xp3;
    ImageView drop;
    ArrayList p1 = new ArrayList();
    Card c1;
    ImageView c11,c12,c13,c14,c15,c16;
    ImageView [] imageViewsArray = {c11,c12,c13,c14,c15,c16};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__game);

        drop = findViewById(R.id.drophere);




        int NumberOfCards = 36;
        Random r = new Random();

        ArrayList Deck = new ArrayList();
       // ArrayList p1 = new ArrayList();
        ArrayList p2 = new ArrayList();
        ArrayList p3 = new ArrayList();
        ArrayList p4 = new ArrayList();
        /**
         *              MACHA
         */
        Card m6 = new Card("macha", "6", 6,BitmapFactory.decodeResource(getResources(),R.drawable.sixmacha));
        Card m7 = new Card("macha", "7", 7,BitmapFactory.decodeResource(getResources(),R.drawable.sevenmacha));
        Card m8 = new Card("macha", "8", 8,BitmapFactory.decodeResource(getResources(),R.drawable.eightmacha));
        Card m9 = new Card("macha", "9", 9,BitmapFactory.decodeResource(getResources(),R.drawable.ninemacha));
        Card m10 = new Card("macha", "10",10,BitmapFactory.decodeResource(getResources(),R.drawable.tenmacha));
        Card mJ = new Card("macha", "J", 11,BitmapFactory.decodeResource(getResources(),R.drawable.jmacha));
        Card mQ = new Card("macha", "Q", 12,BitmapFactory.decodeResource(getResources(),R.drawable.qmacha));
        Card mK = new Card("macha", "K", 13,BitmapFactory.decodeResource(getResources(),R.drawable.kmacha));
        Card mA = new Card("macha", "A", 14,BitmapFactory.decodeResource(getResources(),R.drawable.amacha));
        /**
         *               SINEK
         */
        Card s6 = new Card("sinek", "6", 6,BitmapFactory.decodeResource(getResources(),R.drawable.sixsinek));
        Card s7 = new Card("sinek", "7", 7,BitmapFactory.decodeResource(getResources(),R.drawable.sevensinek));
        Card s8 = new Card("sinek", "8", 8,BitmapFactory.decodeResource(getResources(),R.drawable.eightsinek));
        Card s9 = new Card("sinek", "9", 9,BitmapFactory.decodeResource(getResources(),R.drawable.ninesinek));
        Card s10 = new Card("sinek", "10",10,BitmapFactory.decodeResource(getResources(),R.drawable.tensinek));
        Card sJ = new Card("sinek", "J", 11,BitmapFactory.decodeResource(getResources(),R.drawable.jsinek));
        Card sQ = new Card("sinek", "Q", 12,BitmapFactory.decodeResource(getResources(),R.drawable.qsinek));
        Card sK = new Card("sinek", "K", 13,BitmapFactory.decodeResource(getResources(),R.drawable.ksinek));
        Card sA = new Card("sinek", "A", 14,BitmapFactory.decodeResource(getResources(),R.drawable.asinek));
        /**
         *              KOPA
         */
        Card k6 = new Card("kopa", "6", 6,BitmapFactory.decodeResource(getResources(),R.drawable.sixkoba));
        Card k7 = new Card("kopa", "7", 7,BitmapFactory.decodeResource(getResources(),R.drawable.sevenkoba));
        Card k8 = new Card("kopa", "8", 8,BitmapFactory.decodeResource(getResources(),R.drawable.eightkopa));
        Card k9 = new Card("kopa", "9", 9,BitmapFactory.decodeResource(getResources(),R.drawable.ninekopa));
        Card k10 = new Card("kopa", "10",10,BitmapFactory.decodeResource(getResources(),R.drawable.tenkopa));
        Card kJ = new Card("kopa", "J", 11,BitmapFactory.decodeResource(getResources(),R.drawable.jkopa));
        Card kQ = new Card("kopa", "Q", 12,BitmapFactory.decodeResource(getResources(),R.drawable.qkopa));
        Card kK = new Card("kopa", "K", 13,BitmapFactory.decodeResource(getResources(),R.drawable.kkopa));
        Card kA = new Card("kopa", "A", 14,BitmapFactory.decodeResource(getResources(),R.drawable.akopa));
        /**
         *              KARO - DINAR
         */
        Card d6 = new Card("dinar", "6", 6,BitmapFactory.decodeResource(getResources(),R.drawable.sixkaro));
        Card d7 = new Card("dinar", "7", 7,BitmapFactory.decodeResource(getResources(),R.drawable.sevenkaro));
        Card d8 = new Card("dinar", "8", 8,BitmapFactory.decodeResource(getResources(),R.drawable.eightkaro));
        Card d9 = new Card("dinar", "9", 9,BitmapFactory.decodeResource(getResources(),R.drawable.ninekaro));
        Card d10 = new Card("dinar", "10",10,BitmapFactory.decodeResource(getResources(),R.drawable.tenkaro));
        Card dJ = new Card("dinar", "J", 11,BitmapFactory.decodeResource(getResources(),R.drawable.jkaro));
        Card dQ = new Card("dinar", "Q", 12,BitmapFactory.decodeResource(getResources(),R.drawable.qkaro));
        Card dK = new Card("dinar", "K", 13,BitmapFactory.decodeResource(getResources(),R.drawable.kkaro));
        Card dA = new Card("dinar", "A", 14,BitmapFactory.decodeResource(getResources(),R.drawable.akaro));

        Deck.add(m6);
        Deck.add(m7);
        Deck.add(m8);
        Deck.add(m9);
        Deck.add(m10);
        Deck.add(mJ);
        Deck.add(mQ);
        Deck.add(mK);
        Deck.add(mA);

        Deck.add(s6);
        Deck.add(s7);
        Deck.add(s8);
        Deck.add(s9);
        Deck.add(s10);
        Deck.add(sJ);
        Deck.add(sQ);
        Deck.add(sK);
        Deck.add(sA);


        Deck.add(k6);
        Deck.add(k7);
        Deck.add(k8);
        Deck.add(k9);
        Deck.add(k10);
        Deck.add(kJ);
        Deck.add(kQ);
        Deck.add(kK);
        Deck.add(kA);

        Deck.add(d6);
        Deck.add(d7);
        Deck.add(d8);
        Deck.add(d9);
        Deck.add(d10);
        Deck.add(dJ);
        Deck.add(dQ);
        Deck.add(dK);
        Deck.add(dA);

        /*
        System.out.println("the deck ");
        System.out.println(Deck);


        System.out.println("p1 cards");
        for(int i=0;i<6;i++){
            p1.add(Deck.get(r.nextInt(NumberOfCards)));
            Deck.remove(r.nextInt(NumberOfCards));
            NumberOfCards--;
        }
        System.out.println(p1);

        System.out.println("p2 cards");
        for(int i=0;i<6;i++){
            p2.add(Deck.get(r.nextInt(NumberOfCards)));
            Deck.remove(r.nextInt(NumberOfCards));
            NumberOfCards--;
        }
        System.out.println(p2);

        System.out.println("p3 cards");
        for(int i=0;i<6;i++){
            p3.add(Deck.get(r.nextInt(NumberOfCards)));
            Deck.remove(r.nextInt(NumberOfCards));
            NumberOfCards--;
        }
        System.out.println(p3);

        System.out.println("p4 cards");
        for(int i=0;i<6;i++){
            p4.add(Deck.get(r.nextInt(NumberOfCards)));
            Deck.remove(r.nextInt(NumberOfCards));
            NumberOfCards--;
        }
        System.out.println(p4);


        System.out.println("the rest of the deck");
        System.out.println(Deck);

        Card c1 =  (Card) p1.get(2);
        Card z1 = (Card) p2.get(2);
        if(c1.suit()==z1.suit()){
            if(c1.value()>z1.value())
                System.out.println("you can colse it");
        }
        else
            System.out.println("you cant");

*/



        for(int i=0;i<6;i++){
            int x= r.nextInt(NumberOfCards);
            p1.add(Deck.get(x));
            Deck.remove(x);
            NumberOfCards--;
        }
         c1 = (Card) p1.get(0);
        Card c2 = (Card) p1.get(1);
        Card c3 = (Card) p1.get(2);
        Card c4 = (Card) p1.get(3);
        Card c5 = (Card) p1.get(4);
        Card c6 = (Card) p1.get(5);
        ImageView coz = (ImageView)findViewById(R.id.coz);
         c11 = (ImageView)findViewById(R.id.p21);
         c12 = (ImageView)findViewById(R.id.p22);
         c13 = (ImageView)findViewById(R.id.p23);
         c14 = (ImageView)findViewById(R.id.p24);
         c15 = (ImageView)findViewById(R.id.p25);
         c16 = (ImageView)findViewById(R.id.p26);
        ImageView deck = (ImageView)findViewById(R.id.imageView7);
        c11.setImageBitmap(c1.img());
        c12.setImageBitmap(c2.img());
        c13.setImageBitmap(c3.img());
        c14.setImageBitmap(c4.img());
        c15.setImageBitmap(c5.img());
        c16.setImageBitmap(c6.img());

        Card RandomCoz = (Card)Deck.get(r.nextInt(NumberOfCards));
        coz.setImageBitmap(RandomCoz.img());
        coz.setRotation(90);

        c11.setOnLongClickListener(onLongClickListener);
        c12.setOnLongClickListener(onLongClickListener);
        c13.setOnLongClickListener(onLongClickListener);
        c14.setOnLongClickListener(onLongClickListener);
        c15.setOnLongClickListener(onLongClickListener);
        c16.setOnLongClickListener(onLongClickListener);


        drop.setOnDragListener(onDragListener);







    }


    /**
     * drag and drop:
     * 1-onclıiclistner
     */
    View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View view) {
            ClipData clipData = ClipData.newPlainText("","");
            View.DragShadowBuilder dragShadowBuilder = new View.DragShadowBuilder(view);
            view.startDrag(clipData,dragShadowBuilder,view,0);
            //view.setVisibility(View.INVISIBLE);
            return false;
        }
    };

    /**
     *
     * drag event
     */

    View.OnDragListener onDragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View view, DragEvent dragEvent) {
            int x = dragEvent.getAction();
            final View v = (View)dragEvent.getLocalState();

            switch(x){
                case DragEvent.ACTION_DROP:
                    drop.setScaleType(ImageView.ScaleType.CENTER);
                  //  drop.setImageDrawable(c13.getDrawable());
                    if (c11.isInTouchMode()){
                        drop.setImageDrawable(c11.getDrawable());
                    }
                   else if (c12.isInTouchMode()){
                        drop.setImageDrawable(c12.getDrawable());
                    }
                   else if (c13.isInTouchMode()){
                        drop.setImageDrawable(c13.getDrawable());
                    }
                   else if (c14.isInTouchMode()){
                        drop.setImageDrawable(c14.getDrawable());
                    }
                   else if (c15.isInTouchMode()){
                        drop.setImageDrawable(c15.getDrawable());
                    }
                   else if (c16.isInTouchMode()){
                        drop.setImageDrawable(c16.getDrawable());
                    }
                    //  drop.animate()
                    //        .x(500)
                    //       .y(200)
                    //      .setDuration(900)
                    //      .start();


                    v.setVisibility(View.INVISIBLE);
            }



            return true;
        }
    };

    public void gotomain(View view) {
        xp1 =+ 20;
        Intent ııı = new Intent(this,MainActivity.class);
        ııı.putExtra("xp1",xp1);
        startActivity(ııı);
        finish();
    }

    public void gotomain2(View view) {
        xp2 = 100;
        Intent ııı = new Intent(this,MainActivity.class);
        ııı.putExtra("xp2",xp2);
        startActivity(ııı);
        finish();
    }
}
