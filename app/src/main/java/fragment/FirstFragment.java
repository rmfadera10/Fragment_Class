package fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.letstravel.fragment.MainActivity;
import com.letstravel.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener{

private Button btncalculate;
private EditText txtfirst, txtsecond;
    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first, container, false);

        txtfirst=view.findViewById(R.id.fistnumber);
        txtsecond=view.findViewById(R.id.secondnumber);

        btncalculate=view.findViewById(R.id.btncalculate);
        btncalculate.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int first=Integer.parseInt(txtfirst.getText().toString());
        int second=Integer.parseInt(txtfirst.getText().toString());
        int result=first+second;
        Toast.makeText(getActivity(), "Sum of two number is:" +result, Toast.LENGTH_SHORT).show();
    }
}
