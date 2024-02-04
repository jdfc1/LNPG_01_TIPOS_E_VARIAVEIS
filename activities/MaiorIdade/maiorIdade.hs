main :: IO ()

main = do
    putStrLn "Digite sua idade"

    a <- readLn

    if a >= 18
        then putStrLn $ "A idade digitada (" ++ show a ++ ") corresponde ser de Maior idade "
        else putStrLn $ "A idade digitada (" ++ show a ++ ") corresponde ser de Menor idade "

