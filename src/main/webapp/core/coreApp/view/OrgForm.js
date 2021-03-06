Ext.define("core.view.OrgForm", {
  extend: "Ext.form.Panel",
  alias: "widget.OrgForm",
  layout: "auto",
  align: "left",
  standardSubmit: false,
  frame: true,
  defaults: {
    margin: "7 0 0 15",
    selectOnFocus: true
  },
  tbar: [{
      xtype: "button",
      ref: "save",
      iconCls: 'table_save',
      text: "保存"
    }],
  items: [{
      xtype: "textfield",
      fieldLabel: "类别ID",
      name: "id",
      hidden: true
    }, {
      xtype: "textfield",
      fieldLabel: "类别名称",
      name: "text"
    }, {
      xtype: "textareafield",
      fieldLabel: "类别描述",
      height: 40,
      name: "description"
    }, {
      xtype: "textfield",
      fieldLabel: "父类别ID",
      name: "parent",
      hidden: true
    }, {
      xtype: "textfield",
      fieldLabel: "是否叶子",
      name: "leaf",
      hidden: true
    }]
});