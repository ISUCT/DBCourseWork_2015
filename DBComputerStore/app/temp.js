/**
 * 
 * @author dmitry
 * @module temp
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
        
        
        
        form.button.onActionPerformed = function(){
          P.require(["Employers"],function(Employers){
              var empl = new Employers();
              empl.show();
          });
          
        };
    };
});
