/**=========================================================
 * Module: manage.js
 * Services to retrieve global manage
 =========================================================*/

(function() {
    'use strict';

    angular
        .module('app.manage')
        .service('manageServer', manageServer);

    manageServer.$inject = ['APP_COLORS'];
    function manageServer(APP_COLORS) {
        this.byName = byName;

        ////////////////

        function byName(name) {
          return (APP_COLORS[name] || '#fff');
        }
    }

})();
