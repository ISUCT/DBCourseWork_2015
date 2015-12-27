/**
 * 
 * @author dmitry
 * @module Pos_Held
 */
define(['orm', 'forms', 'ui'], function (Orm, Forms, Ui, ModuleName) {
    return function () {
        var self = this
                , model = Orm.loadModel(ModuleName)
                , form = Forms.loadForm(ModuleName, model);
        
        self.show = function () {
            form.show();
        };
        
        // TODO : place your code here
        
        model.requery(function () {
            // TODO : place your code here
        });
                form.btnSave.onActionPerformed = function () {
            model.save();
            };
        /**
         * Add button's click event handler.
         * @param event Event object
         */
        form.btnAdd.onActionPerformed = function (event) {
            model.qEmployersPos.push({});
        };

        form.btnDelete.onActionPerformed = function (event) {
            if (confirm("Delete owner?")) {
                for (var i in form.modelGrid.selected) {
                    model.qEmployersPos.splice(model.qEmployersPos.indexOf(form.modelGrid.selected[i]), 1);
                }

            }
        };
        
    };
});
