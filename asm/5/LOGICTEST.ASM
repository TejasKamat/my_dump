DATA SEGMENT
        P db 55h
        Q db 96h
DATA ENDS

CODE SEGMENT
ASSUME CS:CODE, DS:DATA
START: MOV AX, DATA
       MOV DS, AX

       MOV AX, 0000h
       MOV BX, 0000h
       MOV AL, P
       NOT AL
       MOV AL, 55h
       MOV BL, 96h
       AND AL, BL
       MOV AL, 55h
       OR AL, BL
       MOV AL, 55h
       XOR AL, BL
QUIT: INT 21h
CODE ENDS
END START


