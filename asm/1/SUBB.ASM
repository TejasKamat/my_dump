DATA SEGMENT
        P dw 0002h
        Q dw 0004h
DATA ENDS

CODE SEGMENT

ASSUME CS: CODE, DS: DATA

START: MOV AX, DATA
       MOV DS, AX
       MOV AX, P
       MOV BX, Q
       SUB BX, AX
QUIT: INT 21h
CODE ENDS
END START


