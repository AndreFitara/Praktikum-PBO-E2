import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class GuiCollection extends javax.swing.JFrame {

    private DefaultListModel<String> listModel;
    private List<String> savedList;

    public GuiCollection() {
        initComponents();
        listModel = new DefaultListModel<>();
        itemList.setModel(listModel);
        savedList = new ArrayList<>();
    }

    private void initComponents() {
        inputField = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        itemList = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUI Collection");

        scrollPane.setViewportView(itemList);

        btnAdd.setText("Add");
        btnAdd.addActionListener(evt -> addItem());

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(evt -> updateItem());

        btnDelete.setText("Delete");
        btnDelete.addActionListener(evt -> deleteItem());

        btnClear.setText("Clear All");
        btnClear.addActionListener(evt -> clearList());

        btnSave.setText("Save");
        btnSave.addActionListener(evt -> saveList());

        btnInsert.setText("Insert");
        btnInsert.addActionListener(evt -> insertSavedItems());

        // Layout code (bisa diubah sesuai kebutuhan Anda)
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputField)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(scrollPane)
        );

        pack();
        setLocationRelativeTo(null); // Center the window
    }

    private void addItem() {
        String item = inputField.getText().trim();
        if (!item.isEmpty()) {
            listModel.addElement(item);
            inputField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Input tidak boleh kosong!");
        }
    }

    private void updateItem() {
        int index = itemList.getSelectedIndex();
        String newValue = inputField.getText().trim();
        if (index != -1 && !newValue.isEmpty()) {
            listModel.set(index, newValue);
            inputField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Pilih item dan isi data baru untuk update.");
        }
    }

    private void deleteItem() {
        int index = itemList.getSelectedIndex();
        if (index != -1) {
            listModel.remove(index);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih item yang ingin dihapus.");
        }
    }

    private void clearList() {
        listModel.clear();
    }

    private void saveList() {
        savedList.clear();
        for (int i = 0; i < listModel.size(); i++) {
            savedList.add(listModel.get(i));
        }
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
    }

    private void insertSavedItems() {
        for (String item : savedList) {
            listModel.addElement(item);
        }
        JOptionPane.showMessageDialog(this, "Data dari list tersimpan berhasil dimasukkan kembali!");
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new GuiCollection().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JButton btnAdd, btnUpdate, btnDelete, btnClear, btnSave, btnInsert;
    private javax.swing.JTextField inputField;
    private javax.swing.JList<String> itemList;
    private javax.swing.JScrollPane scrollPane;
}