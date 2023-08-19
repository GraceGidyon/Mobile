public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemListAdapter adapter;

    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ItemListAdapter();
        recyclerView.setAdapter(adapter);

        
        List<Item> itemList = fetchItemList();

        
        adapter.setItems(itemList);
    }

    
    private List<Item> fetchItemList() {
        List<Item> itemList = new ArrayList<>();
       
        return itemList;
    }
}
