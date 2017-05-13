/* 
Copyright (c) 2003-2010, CKSource - Frederico Knabben. All rights reserved. 
For licensing, see LICENSE.html or http://ckeditor.com/license 
*/  
  
CKEDITOR.editorConfig = function( config )  
{  
// Define changes to default configuration here. For example:  
// config.language = 'fr';  
// config.uiColor = '#AADC6E';  
  
    config.language = 'zh-cn'; // 配置语言    
    config.uiColor = '#FFF'; // 背景颜色    
    config.width = 'auto'; // 宽度    
    config.height = '200px'; // 高度    
    config.skin = 'office2003';//界面v2,kama,office2003  
    config.toolbar = [ ['Bold', 'Italic', 'Underline', '-','Link', 'Unlink', '-', 'Format','Font','FontSize' ] ];//用户自定义的编辑框，可以根据自己的需要任意加入或者去掉元素，这样可以保持编辑框简单明了.  
    config.toolbarCanCollapse = false;  
    config.resize_enabled = false;  
    config.enterMode = CKEDITOR.ENTER_BR;  
    config.shiftEnterMode = CKEDITOR.ENTER_P;  
};  