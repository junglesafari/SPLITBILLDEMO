package com.example.martin.splitbilldemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class peoplename extends AppCompatActivity  {
    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    EditText ed5;
    EditText ed6;


    ImageView b1;
    ImageView b2;
    ImageView b3;
    ImageView b4;
    ImageView b5;
    ImageView b6;

    CardView bc1;
    CardView bc2;
    CardView bc3;
    CardView bc4;
    CardView bc5;
    CardView bc6;

    CardView ec1;
    CardView ec2;
    CardView ec3;
    CardView ec4;
    CardView ec5;
    CardView ec6;

    String user1;
    String user2;
    String user3;
    String user4;
    String user5;
    String user6;

    CardView userimgcard1;
    CardView userimgcard2;
    CardView userimgcard3;
    CardView userimgcard4;
    CardView userimgcard5;
    CardView userimgcard6;


    ImageView userimg1;
    ImageView userimg2;
    ImageView userimg3;
    ImageView userimg4;
    ImageView userimg5;
    ImageView userimg6;


    CardView addpiccard1;
    CardView addpiccard2;
    CardView addpiccard3;
    CardView addpiccard4;
    CardView addpiccard5;
    CardView addpiccard6;




    Button addmember;
    SharedPreferences sharedPrefusername;
    SharedPreferences sharedPrefvalues;


    private static final int PICK_IMAGE_REQUEST1=1;
    private static final int PICK_IMAGE_REQUEST2=2;
    private static final int PICK_IMAGE_REQUEST3=3;
    private static final int PICK_IMAGE_REQUEST4=4;
    private static final int PICK_IMAGE_REQUEST5=5;
    private static final int PICK_IMAGE_REQUEST6=6;

    private Uri mImageuri;
    private Uri user1imageuri;
    private Uri user2imageuri;
    private Uri user3imageuri;
    private Uri user4imageuri;
    private Uri user5imageuri;
    private Uri user6imageuri;
     int peoplenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_peoplename );
        //  getWindow().getDecorView().setBackgroundColor(getResources().getColor( R.color.activitycolor ));


        init();



        sharedPrefusername = getSharedPreferences( "users", Context.MODE_PRIVATE );
        sharedPrefvalues = getSharedPreferences( "values", Context.MODE_PRIVATE );

        Intent intent = getIntent();
         peoplenumber = intent.getIntExtra( "intent1", 2 );

        Toast.makeText( getApplicationContext(), peoplenumber + "", Toast.LENGTH_SHORT ).show();


        String yn = sharedPrefusername.getString( "memberinout", "" );
        if (!yn.equals( "in" )) {
            addmember.setVisibility( View.VISIBLE );
        } else {
            addmember.setVisibility( View.GONE );
        }

        addmember.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storedata(peoplenumber);

            }
        } );


    }

    private void visibleelement(int n) {
        if (n == 2) {


            user1 = sharedPrefusername.getString( "user1", "" );
            user2 = sharedPrefusername.getString( "user2", "" );
            String user1storeimage= sharedPrefusername.getString( "user1imageuri", "" );
            String user2storeimage= sharedPrefusername.getString( "user2imageuri", "" );
            if (!user1.equals( "" )) {
                ed1.setText( user1 );
                ed2.setText( user2 );

                  Picasso.with( peoplename.this ).load(Uri.parse( user1storeimage )  ).fit().into( userimg1 );
                Picasso.with( peoplename.this ).load(Uri.parse(  user2storeimage )).fit().into( userimg2 );

            }


            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );


            bc2.setVisibility( View.VISIBLE );
            bc1.setVisibility( View.VISIBLE );

            userimgcard1.setVisibility( View.VISIBLE );
            userimgcard2.setVisibility( View.VISIBLE );

            addpiccard1.setVisibility( View.VISIBLE );
            addpiccard2.setVisibility( View.VISIBLE );


        } else if (n == 3) {

            user1 = sharedPrefusername.getString( "user1", "" );
            user2 = sharedPrefusername.getString( "user2", "" );
            user3 = sharedPrefusername.getString( "user3", "" );
            String user1storeimage= sharedPrefusername.getString( "user1imageuri", "" );
            String user2storeimage= sharedPrefusername.getString( "user2imageuri", "" );
            String user3storeimage= sharedPrefusername.getString( "user3imageuri", "" );

            if (!user1.equals( "" )) {
                ed1.setText( user1 );
                ed2.setText( user2 );
                ed3.setText( user3 );

                Picasso.with( peoplename.this ).load(Uri.parse( user1storeimage )  ).fit().into( userimg1 );
                Picasso.with( peoplename.this ).load(Uri.parse( user2storeimage )  ).fit().into( userimg2 );
                Picasso.with( peoplename.this ).load(Uri.parse( user3storeimage )  ).fit().into( userimg3 );


            }


            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );
            ec3.setVisibility( View.VISIBLE );

            bc1.setVisibility( View.VISIBLE );
            bc2.setVisibility( View.VISIBLE );
            bc3.setVisibility( View.VISIBLE );

            userimgcard1.setVisibility( View.VISIBLE );
            userimgcard2.setVisibility( View.VISIBLE );
            userimgcard3.setVisibility( View.VISIBLE );

            addpiccard1.setVisibility( View.VISIBLE );
            addpiccard2.setVisibility( View.VISIBLE );
            addpiccard3.setVisibility( View.VISIBLE );




        } else if (n == 4) {

            user1 = sharedPrefusername.getString( "user1", "" );
            user2 = sharedPrefusername.getString( "user2", "" );
            user3 = sharedPrefusername.getString( "user3", "" );
            user4 = sharedPrefusername.getString( "user4", "" );

            String user1storeimage= sharedPrefusername.getString( "user1imageuri", "" );
            String user2storeimage= sharedPrefusername.getString( "user2imageuri", "" );
            String user3storeimage= sharedPrefusername.getString( "user3imageuri", "" );
            String user4storeimage= sharedPrefusername.getString( "user4imageuri", "" );






            if (!user1.equals( "" )) {
                ed1.setText( user1 );
                ed2.setText( user2 );
                ed3.setText( user3 );
                ed4.setText( user4 );


                Picasso.with( peoplename.this ).load(Uri.parse( user1storeimage )  ).fit().into( userimg1 );
                Picasso.with( peoplename.this ).load(Uri.parse( user2storeimage )  ).fit().into( userimg2 );
                Picasso.with( peoplename.this ).load(Uri.parse( user3storeimage )  ).fit().into( userimg3 );
                Picasso.with( peoplename.this ).load(Uri.parse( user4storeimage )  ).fit().into( userimg4 );

            }


            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );
            ec3.setVisibility( View.VISIBLE );
            ec4.setVisibility( View.VISIBLE );


            bc1.setVisibility( View.VISIBLE );
            bc2.setVisibility( View.VISIBLE );
            bc3.setVisibility( View.VISIBLE );
            bc4.setVisibility( View.VISIBLE );


            userimgcard1.setVisibility( View.VISIBLE );
            userimgcard2.setVisibility( View.VISIBLE );
            userimgcard3.setVisibility( View.VISIBLE );
            userimgcard4.setVisibility( View.VISIBLE );

            addpiccard1.setVisibility( View.VISIBLE );
            addpiccard2.setVisibility( View.VISIBLE );
            addpiccard3.setVisibility( View.VISIBLE );
            addpiccard4.setVisibility( View.VISIBLE );





        } else if (n == 5) {
            user1 = sharedPrefusername.getString( "user1", "" );
            user2 = sharedPrefusername.getString( "user2", "" );
            user3 = sharedPrefusername.getString( "user3", "" );
            user4 = sharedPrefusername.getString( "user4", "" );
            user5 = sharedPrefusername.getString( "user5", "" );
            String user1storeimage= sharedPrefusername.getString( "user1imageuri", "" );
            String user2storeimage= sharedPrefusername.getString( "user2imageuri", "" );
            String user3storeimage= sharedPrefusername.getString( "user3imageuri", "" );
            String user4storeimage= sharedPrefusername.getString( "user4imageuri", "" );
            String user5storeimage= sharedPrefusername.getString( "user5imageuri", "" );


            if (!user1.equals( "" )) {
                ed1.setText( user1 );
                ed2.setText( user2 );
                ed3.setText( user3 );
                ed4.setText( user4 );
                ed5.setText( user5 );

                Picasso.with( peoplename.this ).load(Uri.parse( user1storeimage )  ).fit().into( userimg1 );
                Picasso.with( peoplename.this ).load(Uri.parse( user2storeimage )  ).fit().into( userimg2 );
                Picasso.with( peoplename.this ).load(Uri.parse( user3storeimage ) ).fit().into( userimg3 );
                Picasso.with( peoplename.this ).load(Uri.parse( user4storeimage )  ).fit().into( userimg4 );
                Picasso.with( peoplename.this ).load(Uri.parse( user5storeimage )  ).fit().into( userimg5 );


            }


            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );
            ec3.setVisibility( View.VISIBLE );
            ec4.setVisibility( View.VISIBLE );
            ec5.setVisibility( View.VISIBLE );

            bc1.setVisibility( View.VISIBLE );
            bc2.setVisibility( View.VISIBLE );
            bc3.setVisibility( View.VISIBLE );
            bc4.setVisibility( View.VISIBLE );
            bc5.setVisibility( View.VISIBLE );


            userimgcard1.setVisibility( View.VISIBLE );
            userimgcard2.setVisibility( View.VISIBLE );
            userimgcard3.setVisibility( View.VISIBLE );
            userimgcard4.setVisibility( View.VISIBLE );
            userimgcard5.setVisibility( View.VISIBLE );

            addpiccard1.setVisibility( View.VISIBLE );
            addpiccard2.setVisibility( View.VISIBLE );
            addpiccard3.setVisibility( View.VISIBLE );
            addpiccard4.setVisibility( View.VISIBLE );
            addpiccard5.setVisibility( View.VISIBLE );


        } else if (n == 6) {

            user1 = sharedPrefusername.getString( "user1", "" );
            user2 = sharedPrefusername.getString( "user2", "" );
            user3 = sharedPrefusername.getString( "user3", "" );
            user4 = sharedPrefusername.getString( "user4", "" );
            user5 = sharedPrefusername.getString( "user5", "" );
            user6 = sharedPrefusername.getString( "user6", "" );

            String user1storeimage= sharedPrefusername.getString( "user1imageuri", "" );
            String user2storeimage= sharedPrefusername.getString( "user2imageuri", "" );
            String user3storeimage= sharedPrefusername.getString( "user3imageuri", "" );
            String user4storeimage= sharedPrefusername.getString( "user4imageuri", "" );
            String user5storeimage= sharedPrefusername.getString( "user5imageuri", "" );
            String user6storeimage= sharedPrefusername.getString( "user6imageuri", "" );


            if (!user1.equals( "" )) {
                ed1.setText( user1 );
                ed2.setText( user2 );
                ed3.setText( user3 );
                ed4.setText( user4 );
                ed5.setText( user5 );
                ed6.setText( user6 );



                Picasso.with( peoplename.this ).load( Uri.parse( user1storeimage )).fit().into( userimg1 );
                Picasso.with( peoplename.this ).load(Uri.parse( user2storeimage ) ).fit().into( userimg2 );
                Picasso.with( peoplename.this ).load(Uri.parse( user3storeimage )  ).fit().into( userimg3 );
                Picasso.with( peoplename.this ).load(Uri.parse( user4storeimage )  ).fit().into( userimg4 );
                Picasso.with( peoplename.this ).load(Uri.parse( user5storeimage )  ).fit().into( userimg5 );
                Picasso.with( peoplename.this ).load(Uri.parse( user6storeimage )  ).fit().into( userimg6 );


            }


            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );
            ec3.setVisibility( View.VISIBLE );
            ec4.setVisibility( View.VISIBLE );
            ec5.setVisibility( View.VISIBLE );
            ec6.setVisibility( View.VISIBLE );

            bc1.setVisibility( View.VISIBLE );
            bc2.setVisibility( View.VISIBLE );
            bc3.setVisibility( View.VISIBLE );
            bc4.setVisibility( View.VISIBLE );
            bc5.setVisibility( View.VISIBLE );
            bc6.setVisibility( View.VISIBLE );

            userimgcard1.setVisibility( View.VISIBLE );
            userimgcard2.setVisibility( View.VISIBLE );
            userimgcard3.setVisibility( View.VISIBLE );
            userimgcard4.setVisibility( View.VISIBLE );
            userimgcard5.setVisibility( View.VISIBLE );
            userimgcard6.setVisibility( View.VISIBLE );

            addpiccard1.setVisibility( View.VISIBLE );
            addpiccard2.setVisibility( View.VISIBLE );
            addpiccard3.setVisibility( View.VISIBLE );
            addpiccard4.setVisibility( View.VISIBLE );
            addpiccard5.setVisibility( View.VISIBLE );
            addpiccard6.setVisibility( View.VISIBLE );



        }


    }

    private void storedata(int m) {
        SharedPreferences.Editor editor = sharedPrefusername.edit();
        editor.putString("memberinout","in"  );

        if (m == 2) {
            user1 = ed1.getText().toString().trim();
            user2 = ed2.getText().toString().trim();

            if (user1.equals( "" ) || user2.equals( "" )) {
                Toast.makeText( getApplicationContext(), "Please fill the member name", Toast.LENGTH_SHORT ).show();
            } else {
                editor.putString( "user1", user1 );
                editor.putString( "user2", user2 );

                editor.putString( "user1imageuri",String.valueOf( user1imageuri) );
                editor.putString( "user2imageuri",String.valueOf( user2imageuri) );

                editor.putInt( "mnumber",2 );
                editor.commit();


            }


        } else if (m == 3) {
            user1 = ed1.getText().toString().trim();
            user2 = ed2.getText().toString().trim();
            user3 = ed3.getText().toString().trim();

            if (user1.equals( "" ) || user2.equals( "" ) || user3.equals( "" )) {
                Toast.makeText( getApplicationContext(), "Please fill the name of all members", Toast.LENGTH_SHORT ).show();
            } else {
                editor.putString( "user1", user1 );
                editor.putString( "user2", user2 );
                editor.putString( "user3", user3 );
                editor.putString( "user1imageuri",String.valueOf(  user1imageuri) );
                editor.putString( "user2imageuri",String.valueOf(  user2imageuri));
                editor.putString( "user3imageuri",String.valueOf(  user3imageuri));
                editor.putInt( "mnumber",3 );
                editor.commit();





            }
        } else if (m == 4) {


            user1 = ed1.getText().toString().trim();
            user2 = ed2.getText().toString().trim();
            user3 = ed3.getText().toString().trim();
            user4 = ed4.getText().toString().trim();

            if (user1.equals( "" ) || user2.equals( "" ) || user3.equals( "" ) || user4.equals( "" )) {
                Toast.makeText( getApplicationContext(), "Please fill the name of all members", Toast.LENGTH_SHORT ).show();
            } else {
                editor.putString( "user1", user1 );
                editor.putString( "user2", user2 );
                editor.putString( "user3", user3 );
                editor.putString( "user4", user4 );

                editor.putString( "user1imageuri",String.valueOf(  user1imageuri));
                editor.putString( "user2imageuri",String.valueOf(  user2imageuri) );
                editor.putString( "user3imageuri",String.valueOf(  user3imageuri) );
                editor.putString( "user4imageuri",String.valueOf(  user4imageuri) );

                editor.putInt( "mnumber",4 );
                editor.commit();

            }


        } else if (m == 5) {


            user1 = ed1.getText().toString().trim();
            user2 = ed2.getText().toString().trim();
            user3 = ed3.getText().toString().trim();
            user4 = ed4.getText().toString().trim();
            user5 = ed5.getText().toString().trim();

            if (user1.equals( "" ) || user2.equals( "" ) || user3.equals( "" ) || user4.equals( "" ) || user5.equals( "" )) {
                Toast.makeText( getApplicationContext(), "Please fill the name of all members", Toast.LENGTH_SHORT ).show();
            } else {
                editor.putString( "user1", user1 );
                editor.putString( "user2", user2 );
                editor.putString( "user3", user3 );
                editor.putString( "user4", user4 );
                editor.putString( "user5", user5 );

                editor.putString( "user1imageuri",String.valueOf(  user1imageuri) );
                editor.putString( "user2imageuri",String.valueOf(  user2imageuri) );
                editor.putString( "user3imageuri",String.valueOf(  user3imageuri) );
                editor.putString( "user4imageuri",String.valueOf(  user4imageuri));
                editor.putString( "user5imageuri",String.valueOf(  user5imageuri));

                editor.putInt( "mnumber",5 );
                editor.commit();

            }


        } else if (m == 6) {

            user1 = ed1.getText().toString().trim();
            user2 = ed2.getText().toString().trim();
            user3 = ed3.getText().toString().trim();
            user4 = ed4.getText().toString().trim();
            user5 = ed5.getText().toString().trim();
            user6 = ed6.getText().toString().trim();

            if (user1.equals( "" ) || user2.equals( "" ) || user3.equals( "" ) || user4.equals( "" ) || user5.equals( "" )||user6.equals( "" )) {
                Toast.makeText( getApplicationContext(), "Please fill the name of all members", Toast.LENGTH_SHORT ).show();
            } else {
                editor.putString( "user1", user1 );
                editor.putString( "user2", user2 );
                editor.putString( "user3", user3 );
                editor.putString( "user4", user4 );
                editor.putString( "user5", user5 );
                editor.putString( "user6", user6 );

                editor.putString( "user1imageuri",String.valueOf(  user1imageuri) );
                editor.putString( "user2imageuri",String.valueOf(  user2imageuri) );
                editor.putString( "user3imageuri",String.valueOf(  user3imageuri) );
                editor.putString( "user4imageuri",String.valueOf(  user4imageuri) );
                editor.putString( "user5imageuri",String.valueOf(  user5imageuri) );
                editor.putString( "user6imageuri",String.valueOf(  user6imageuri));



                editor.putInt( "mnumber",6 );
                editor.commit();

            }


        }

    }

    private void init() {
        addmember = findViewById( R.id.addmember );

        ed1 = findViewById( R.id.ed1 );
        ed2 = findViewById( R.id.ed2 );
        ed3 = findViewById( R.id.ed3 );
        ed4 = findViewById( R.id.ed4 );
        ed5 = findViewById( R.id.ed5 );
        ed6 = findViewById( R.id.ed6 );


        ec1 = findViewById( R.id.ec1 );
        ec2 = findViewById( R.id.ec2 );
        ec3 = findViewById( R.id.ec3 );
        ec4 = findViewById( R.id.ec4 );
        ec5 = findViewById( R.id.ec5 );
        ec6 = findViewById( R.id.ec6 );


        b1 = findViewById( R.id.b1 );
        b2 = findViewById( R.id.b2 );
        b3 = findViewById( R.id.b3 );
        b4 = findViewById( R.id.b4 );
        b5 = findViewById( R.id.b5 );
        b6 = findViewById( R.id.b6 );


        bc1 = findViewById( R.id.cardView6 );
        bc2 = findViewById( R.id.cardView7 );
        bc3 = findViewById( R.id.cardView8 );
        bc4 = findViewById( R.id.cardView9 );
        bc5 = findViewById( R.id.cardView10 );
        bc6 = findViewById( R.id.cardView11 );

        userimgcard1 = findViewById( R.id.cardView14 );
        userimgcard2 = findViewById( R.id.cardView15 );
        userimgcard3 = findViewById( R.id.cardView16 );
        userimgcard4 = findViewById( R.id.cardView17 );
        userimgcard5 = findViewById( R.id.cardView18 );
        userimgcard6 = findViewById( R.id.cardView19 );

        userimg1 = findViewById( R.id.user1img );
        userimg2 = findViewById( R.id.user2img );
        userimg3 = findViewById( R.id.user3img );
        userimg4 = findViewById( R.id.user4img );
        userimg5 = findViewById( R.id.user5img );
        userimg6 = findViewById( R.id.user6img );


        addpiccard1 = findViewById( R.id.addpiccard1 );
        addpiccard2 = findViewById( R.id.addpiccard2 );
        addpiccard3 = findViewById( R.id.addpiccard3 );
        addpiccard4 = findViewById( R.id.addpiccard4 );
        addpiccard5 = findViewById( R.id.addpiccard5 );
        addpiccard6 = findViewById( R.id.addpiccard6 );


    }

  public  void   loadimage(View view){
        int id=view.getId();
        switch (id){
            case R.id.adduserpic1:
                openfilechooser(PICK_IMAGE_REQUEST1);
                break;
            case R.id.adduserpic2:
                openfilechooser(PICK_IMAGE_REQUEST2);
                break;
            case R.id.adduserpic3:
                openfilechooser(PICK_IMAGE_REQUEST3);
                break;
            case R.id.adduserpic4:
                openfilechooser(PICK_IMAGE_REQUEST4);
                break;
            case R.id.adduserpic5:
                openfilechooser(PICK_IMAGE_REQUEST5);
                break;
            case R.id.adduserpic6:
                openfilechooser(PICK_IMAGE_REQUEST6);
                    break;
        }



    }



    private void openfilechooser(int pickimagecode){
        Intent intent=new Intent(  );
        intent.setType( "image/*" );
        intent.setAction(Intent.ACTION_GET_CONTENT  );
        startActivityForResult( intent,pickimagecode );

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==PICK_IMAGE_REQUEST1&&resultCode==RESULT_OK&&data!=null&&data.getData()!=null){
            user1imageuri=data.getData();
            Picasso.with( this ).load( user1imageuri).fit().into( userimg1 );
        }else if(requestCode==PICK_IMAGE_REQUEST2&&resultCode==RESULT_OK&&data!=null&&data.getData()!=null){
            user2imageuri=data.getData();
            Picasso.with( this ).load( user2imageuri).fit().into( userimg2 );
        }else if(requestCode==PICK_IMAGE_REQUEST3&&resultCode==RESULT_OK&&data!=null&&data.getData()!=null){
            user3imageuri=data.getData();
            Picasso.with( this ).load( user3imageuri ).fit().into( userimg3 );
        }else if(requestCode==PICK_IMAGE_REQUEST4&&resultCode==RESULT_OK&&data!=null&&data.getData()!=null){
            user4imageuri=data.getData();
            Picasso.with( this ).load(user4imageuri ).fit().into( userimg4 );
        }else if(requestCode==PICK_IMAGE_REQUEST5&&resultCode==RESULT_OK&&data!=null&&data.getData()!=null){
            user5imageuri=data.getData();
            Picasso.with( this ).load(user5imageuri ).fit().into( userimg5 );
        }else if(requestCode==PICK_IMAGE_REQUEST6&&resultCode==RESULT_OK&&data!=null&&data.getData()!=null){
            user6imageuri=data.getData();
            Picasso.with( this ).load( user6imageuri ).fit().into( userimg6 );
        }
        super.onActivityResult( requestCode, resultCode, data );
    }

    @Override
    protected void onStart() {
        super.onStart();
        visibleelement( peoplenumber );
    }
}
