package ua.kh.bersserk.lessons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Lesson2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);
    }



    //    Тут я за тебя добавил меню для переключения между уроками.
//    Потом научишься сам его клепать. Это не сложно.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.lesson1:
                finish();
                Intent toLesson1 = new Intent(this, MainActivity.class);
                startActivity(toLesson1);
                break;

            case R.id.lesson2:
                finish();
                Intent toLesson2 = new Intent(this, Lesson2.class);
                startActivity(toLesson2);
                break;

            case R.id.lesson3:
                finish();
                Intent toLesson3 = new Intent(this, Lesson3.class);
                startActivity(toLesson3);
                break;

            case R.id.lesson4:
                finish();
                Intent toLesson4 = new Intent(this, Lesson4.class);
                startActivity(toLesson4);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
