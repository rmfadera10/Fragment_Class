package fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.letstravel.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {
 private EditText txtradius;
 private Button btnArea;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);

        txtradius=view.findViewById(R.id.txtradius);
        btnArea=view.findViewById(R.id.btnArea);
        btnArea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int radiuss=Integer.parseInt(txtradius.getText().toString());
        float area=3.14f*radiuss*radiuss;
        Toast.makeText(getActivity(), "Area of Circle =" +area, Toast.LENGTH_SHORT).show();
    }
}
