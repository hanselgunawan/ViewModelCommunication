# Using View Model to Communicate Between Fragments and Activity

## View Model
View Model is a designed class that stores and manages UI-related data in a lifecycle conscious way.

## Dependencies
```
def lifecycle_version = "2.2.0"
// ViewModel
implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
// LiveData
implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
```

## Steps To Implement
### Create a View Model Class
```
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    private val myStr: MutableLiveData<String> = MutableLiveData()

    fun setText(input: String) {
         myStr.value = input
    }

    fun getText(): LiveData<String> {
        return myStr
    }

}
```

### Call It from an Activity / a Fragment by Using ViewModelProvider
```
private val viewModel: SharedViewModel by lazy {
    ViewModelProvider(this).get(SharedViewModel::class.java)
}

viewModel.setText(editText.text.toString())

viewModel.getText().observe(this, Observer<String> {
    activity!!.editText.setText(it)
})
```
ViewModelProviders is [deprecated](https://developer.android.com/reference/androidx/lifecycle/ViewModelProviders).
