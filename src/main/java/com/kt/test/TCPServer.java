p a c k a g e   c o m . k t . t e s t ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . n e t . I n e t A d d r e s s ;  
 i m p o r t   j a v a . n e t . I n e t S o c k e t A d d r e s s ;  
 i m p o r t   j a v a . n e t . S e r v e r S o c k e t ;  
 i m p o r t   j a v a . n e t . S o c k e t ;  
  
 p u b l i c   c l a s s   T C P S e r v e r   {  
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s ) {  
                 f i n a l   i n t   S E R V E R _ P O R T   =   5 0 0 0 ;  
  
                 S e r v e r S o c k e t   s e r v e r S o c k e t   =   n u l l ;  
  
                 t r y {  
                         / /   1 .   ???  ???  ???  ??1? 
                         s e r v e r S o c k e t   =   n e w   S e r v e r S o c k e t ( ) ;  
  
                         / /   2 .   ???D?  8֤¸?X?  ?Ӹ?@?  b i n d i n g  
                         S t r i n g   l o c a l H o s t A d d r e s s   =   I n e t A d d r e s s . g e t L o c a l H o s t ( ) . g e t H o s t A d d r e s s ( ) ;  
                         s e r v e r S o c k e t . b i n d ( n e w   I n e t S o c k e t A d d r e s s ( l o c a l H o s t A d d r e s s ,   S E R V E R _ P O R T ) ) ;  
                         S y s t e m . o u t . p r i n t l n ( " [ s e r v e r ]   b i n d i n g !   \ n a d d r e s s : "   +   l o c a l H o s t A d d r e s s   +   " ,   p o r t : "   +   S E R V E R _ P O R T ) ;  
  
                         / /   3 .   t?|?tǸŸ?\???0?  ?Ű?  ?ƭ?t?  ,?  L?L???   ?0? 
                         / /   ?Ű?  ?ƭ?t?  $?0?  ?L???  ?????  b l o c k   ????t?p?,  
                         / /   T C P   ?Ű?  ???x?  3 - w a y   h a n d s h a k e \?  ?Ű?t?  ?t?  ????D?  ?\?  S o c k e t   ??? ?  ?X?(? 
                         / /   T C P   ?Ű?@?  j a v a ???  ?̬?t???p?,   T?  ?????<?\???  O S  ?  ?̬?\???.  
                         S o c k e t   s o c k e t   =   s e r v e r S o c k e t . a c c e p t ( ) ;  
  
                         / /   4 .   ?Ű?  ?ƭ?t?  $?t?  ?Ű?t?  ???䲔?  T?????  ??%? 
                         I n e t S o c k e t A d d r e s s   r e m o t e S o c k e t A d d r e s s   = ( I n e t S o c k e t A d d r e s s ) s o c k e t . g e t R e m o t e S o c k e t A d d r e s s ( ) ;  
                         S t r i n g   r e m o t e H o s t N a m e   =   r e m o t e S o c k e t A d d r e s s . g e t A d d r e s s ( ) . g e t H o s t A d d r e s s ( ) ;  
                         i n t   r e m o t e H o s t P o r t   =   r e m o t e S o c k e t A d d r e s s . g e t P o r t ( ) ;  
                         S y s t e m . o u t . p r i n t l n ( " [ s e r v e r ]   c o n n e c t e d !   \ n c o n n e c t e d   s o c k e t   a d d r e s s : "   +   r e m o t e H o s t N a m e  
                                         +   " ,   p o r t : "   +   r e m o t e H o s t P o r t ) ;  
  
                 }  
                 c a t c h ( I O E x c e p t i o n   e ) {  
                         e . p r i n t S t a c k T r a c e ( ) ;  
                 }  
                 f i n a l l y {  
                         t r y {  
                                 i f (   s e r v e r S o c k e t   ! =   n u l l   & &   ! s e r v e r S o c k e t . i s C l o s e d ( )   ) {  
                                         s e r v e r S o c k e t . c l o s e ( ) ;  
                                 }  
                         }  
                         c a t c h ( I O E x c e p t i o n   e ) {  
                                 e . p r i n t S t a c k T r a c e ( ) ;  
                         }  
                 }  
         }  
 } 