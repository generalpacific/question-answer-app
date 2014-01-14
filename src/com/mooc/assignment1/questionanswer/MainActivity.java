package com.mooc.assignment1.questionanswer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	private static List<String> questions = null;
	private static List<String> answers = null;
	private static int num = 0;
	private static int lastInt = -1;
	
	static{
		/*
		 * Add questions and corresponding answers
		 */
		questions = new ArrayList<String>();
		answers = new ArrayList<String>();
		
		questions.add("What is the capital of US?");
		answers.add("Washington");
		++num;
		questions.add("What is the capital of California?");
		answers.add("Sacramento");
		++num;
		questions.add("Which is the longest river in the World?");
		answers.add("Nile");
		++num;
		questions.add("Which is the tallest peak in the world?");
		answers.add("Mt. Everest");
		++num;
		questions.add("Entomology is the science that studies");
		answers.add("Insects");
		++num;
		questions.add("Which is the largest country by area in the world?");
		answers.add("Russia");
		++num;
		questions.add("Which is the largest country by area in the world?");
		answers.add("Russia");
		++num;
		questions.add("Hitler party which came into power in 1933 is known as");
		answers.add("Nazi Party");
		++num;
		questions.add("Fire temple is the place of worship of which of the following religion?");
		answers.add("Zoroastrianism (Parsi Religion)");
		++num;
		questions.add("The Olympic Flame, was, for the first time, ceremonially lighted and burnt in a giant torch at the entrance of the stadium at?");
		answers.add("Amsterdam Games (1928)");
		++num;
		questions.add("The reaction which converts sugar solution into alcohol is an example of?");
		answers.add("fermentation");
		++num;
		questions.add("The number of already named bones in the human skeleton is?");
		answers.add("206");
		++num;
		questions.add("The national sport of Canada is?");
		answers.add("Lacrosse");
		++num;
		questions.add("The origin of modern badminton is attributed to?");
		answers.add("Britain");
		++num;
		questions.add("What is part of a database that holds only one type of information?");
		answers.add("Field");
		++num;
		questions.add("'OS' computer abbreviation usually means ?");
		answers.add("Operating System");
		++num;
		questions.add("'.MOV' extension refers usually to what kind of file");
		answers.add("Animation/movie file");
		++num;
		questions.add("What does AM mean?");
		answers.add("Amplitude modulation");
		++num;
		questions.add("What was the first ARPANET message?");
		answers.add("'lo'");
		++num;
		questions.add("'DTP' computer abbreviation usually means ?");
		answers.add("DeskTop Publishing");
		++num;
		questions.add("Who is largely responsible for breaking the German Enigma codes, created a test that provided a foundation for artificial intelligence?");
		answers.add("Alan Turing");
		++num;
		questions.add("Who developed Yahoo");
		answers.add("David Filo & Jerry Yang");
		++num;
		questions.add("The purpose of choke in tube light is ?");
		answers.add("To increase the voltage momentarily");
		++num;
		questions.add("What do we call a collection of two or more computers that are located within a limited distance of each other and that are connected to each other directly or indirectly?");
		answers.add("Local Area Network");
		++num;
		questions.add("Where is the headquarters of Intel located?");
		answers.add("Santa Clara, California");
		++num;
	}
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        // get the text view
        TextView textView = (TextView)findViewById(R.id.textView1);
        
        int orientation = getResources().getConfiguration().orientation;
        
        if(orientation == 1) {
        	// this is portrait mode
        	// Display question
        	Random r = new Random();
            int random = r.nextInt();
            if(random < 0) {
            	random *= -1;
            }
    		int index = random%num;
        	textView.setText(questions.get(index));
        	lastInt = index;
        }else {
        	// this is lanscape mode
        	// display answer
        	if(lastInt == -1) {
        		textView.setText("");
        		TextView textView3 = (TextView)findViewById(R.id.textView3);
        		textView3.setText("Please rotate the phone to check the question");
        		TextView textView2 = (TextView)findViewById(R.id.textView2);
        		textView2.setText("");
        	}else{
        		textView.setText(answers.get(lastInt));	
        	}
        }
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

