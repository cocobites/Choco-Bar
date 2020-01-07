package com.cocobites.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cocobites.chocobar.Choco;
import com.cocobites.chocobar.ChocoBar;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChocoBar.create(MainActivity.this, new Function1<Choco, Unit>() {
                    @Override
                    public Unit invoke(Choco choco) {
                        choco.setTitle("ChocoBar");
                        choco.setText("Description");
                        return null;
                    }
                }).show();
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChocoBar.create(MainActivity.this, new Function1<Choco, Unit>() {
                    @Override
                    public Unit invoke(Choco choco) {
                        choco.setTitle("Title");
                        choco.setText("Description");
                        choco.setChocoBackgroundColor(getResources().getColor(R.color.colorBlue));
                        choco.setTitleTypeface(Typeface.DEFAULT_BOLD);
                        return null;
                    }
                }).show();
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChocoBar.create(MainActivity.this, new Function1<Choco, Unit>() {
                    @Override
                    public Unit invoke(Choco choco) {
                        choco.setTitle("Title");
                        choco.setText("Description");
                        choco.setIcon(R.drawable.ic_event_available_black_24dp);
                        return null;
                    }
                }).show();
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChocoBar.create(MainActivity.this, new Function1<Choco, Unit>() {
                    @Override
                    public Unit invoke(Choco choco) {
                        choco.setTitle("Title");
                        choco.setText(R.string.verbose_text);
                        choco.setIcon(R.drawable.ic_event_available_black_24dp);
                        return null;
                    }
                }).show();
            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChocoBar.create(MainActivity.this, new Function1<Choco, Unit>() {
                    @Override
                    public Unit invoke(Choco choco) {
                        choco.setTitle("Title");
                        choco.setText("Description");
                        choco.setEnableInfiniteDuration(true);
                        return null;
                    }
                }).show();
            }
        });
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChocoBar.create(MainActivity.this, new Function1<Choco, Unit>() {
                    @Override
                    public Unit invoke(Choco choco) {
                        choco.setTitle("Title");
                        choco.setText("Loading..");
                        choco.setEnableProgress(true);
                        return null;
                    }
                }).show();
            }
        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChocoBar.create(MainActivity.this, new Function1<Choco, Unit>() {
                    @Override
                    public Unit invoke(Choco choco) {
                        choco.setTitle("Choco Title");
                        choco.setText("This is Text , it's very short and I don't like short \n This is Text , it's very short and I don't like short");
                        choco.setEnableInfiniteDuration(true);
                        choco.enableSwipeToDismiss();
                        return null;
                    }
                }).show();
            }
        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChocoBar.create(MainActivity.this, new Function1<Choco, Unit>() {
                    @Override
                    public Unit invoke(Choco choco) {
                        choco.setTitle("Choco Title");
                        choco.setText("This is Text , it's very short and I don't like short \n This is Text , it's very short and I don't like short");
                        choco.onShow(new Function0<Unit>() {
                            @Override
                            public Unit invoke() {
                                Toast.makeText(MainActivity.this, "onShowListener", Toast.LENGTH_SHORT).show();
                                return null;
                            }
                        });
                        choco.onDismiss(new Function0<Unit>() {
                            @Override
                            public Unit invoke() {
                                Toast.makeText(MainActivity.this, "onDismissListener", Toast.LENGTH_SHORT).show();
                                return null;
                            }
                        });
                        choco.enableSwipeToDismiss();
                        return null;
                    }
                }).show();
            }
        });
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChocoBar.create(MainActivity.this, new Function1<Choco, Unit>() {
                    @Override
                    public Unit invoke(final Choco choco) {
                        choco.setTitle("Choco Title");
                        choco.setText("This is Text , it's very short and I don't like short \n This is Text , it's very short and I don't like short");
                        choco.setEnableInfiniteDuration(true);
                        choco.addButton("OK", R.style.ButtonStyle, new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                choco.hide(true);
                                Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
                            }
                        });
                        choco.addButton("Cancel", R.style.ButtonStyle, new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                choco.hide(true);
                                Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                            }
                        });
                        return null;
                    }
                }).show();
            }
        });
    }
}
