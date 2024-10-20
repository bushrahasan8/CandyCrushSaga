package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.Charset;

/* loaded from: PDF417.class */
public final class PDF417 {
    private static final int[][] CODEWORD_TABLE = {$d2j$hex$bfb02706$decode_I("c0d50100f0ea01007cf50100e0d4010078ea01003ef50100c0a8010070d4010060a801004050010030a8010020500100c0ad0100f0d601007ceb0100e0ac010078d601003eeb0100c058010070ac010060580100c05d0100f0ae01007cd70100e05c010078ae01003ed70100705c01003cae0100f05e01007caf0100785e01003eaf01007c5f0100faf50100e0d2010078e90100bef40100c0a4010070d201003ce9010060a4010038d201004048010030a401001cd201002048010018a4010010480100e0a6010078d30100bee90100c04c010070a601003cd30100604c010038a601001ed30100304c01001ca60100e04e010078a70100bed30100704e01003ca70100384e01001ea70100784f0100bea701003c4f01001e4f0100c0a2010070d10100bce8010060a2010038d101009ee801004044010030a201001cd101002044010018a201001044010008440100c046010070a30100bcd101006046010038a301009ed10100304601001ca30100184601000c46010070470100bca30100384701009ea301001c470100bc47010060a10100b8d001005ee801004042010030a101009cd001002042010018a101008ed00100104201000ca101000842010006a1010060430100b8a10100ded00100304301009ca10100184301008ea101000c43010006430100dea101008e43010040410100b0a001005cd001002041010098a001004ed00100104101008ca001000841010086a0010004410100b0410100984101008c410100a04001002ed001004ca0010046a0010082400100e0ca010078e50100bef20100c094010070ca01003ce501006094010038ca01001ee50100402801003094010020280100e096010078cb0100bee50100c02c0100709601003ccb0100602c010038960100302c0100182c0100e02e010078970100becb0100702e01003c970100382e01001c2e0100782f0100be9701003c2f0100be2f0100c0da010070ed0100bcf6010060da010038ed01009ef6010040b4010030da01001ced010020b4010018da01000eed010010b401000cda0100c092010070c90100bce40100c0b601006092010038c901009ee4010060b6010038db01009eed0100406c010020240100189201000ec90100206c010018b60100106c0100c026010070930100bcc90100c06e010060260100389301009ec90100606e010038b701009edb0100306e010018260100186e010070270100bc930100706f0100382701009e930100386f01009eb701001c6f0100bc270100bc6f01009e2701009e6f010060d90100b8ec01005ef6010040b2010030d901009cec010020b2010018d901008eec010010b201000cd9010008b2010004b2010060910100b8c801005ee4010060b30100309101009cc8010040660100202201009cd901008ec8010020660100102201000c910100106601000cb30100069101000422010060230100b8910100dec8010060670100302301009c910100306701009cb301008e910100186701000c23010006230100b8230100de910100b86701009c2301009c6701008e2301008e670100de67010040b10100b0d801005cec010020b1010098d801004eec010010b101008cd8010008b1010086d8010004b1010002b1010040210100b09001005cc801004063010020210100989001004ec801002063010098b10100ced801001063010008210100869001000863010086b1010004630100b0210100dc900100b063010098210100ce90010098630100ceb101008c6301008621010086630100dc630100ce630100a0b0010058d801002eec010090b001004cd8010088b0010046d8010084b0010082b00100a0200100589001002ec80100a0610100902001004c90010090610100ccb001004690010088610100842001008461010082200100d8200100d8610100cc610100c66101002cd8010026d8010042b001002c90010048200100c8600100c4600100c2600100c08a010070c50100bce20100608a010038c5010040140100308a01001cc5010020140100188a01001014010008140100c0160100708b0100bcc5010060160100388b01009ec50100301601001c8b0100181601000c16010070170100bc8b0100381701009e8b01001c170100bc1701009e17010060cd0100b8e601005ef30100409a010030cd01009ce60100209a010018cd01008ee60100109a01000ccd0100089a010006cd010060890100b8c401005ee20100609b0100308901009cc4010040360100201201009ccd01008ec4010020360100189b01000c89010010360100081201000836010060130100b8890100dec401006037010030130100decd0100303701009c9b01008e890100183701000c1301000c370100b8130100de890100b83701009c1301009c3701008e130100de130100de37010040dd0100b0ee01005cf7010020dd010098ee01004ef7010010dd01008cee010008dd010086ee010004dd010040990100b0cc01005ce6010040bb010020990100dcee01004ee6010020bb010098dd0100ceee010010bb01000899010086cc010008bb010086dd01000299010040110100b08801005cc401004033010020110100988801004ec40100407701002033010098990100cecc01002077010098bb0100cedd0100868801001077010008330100869901000877010002110100b0110100dc880100b033010098110100ce880100b077010098330100ce99010098770100cebb01008611010086330100dc110100dc330100ce110100dc770100ce330100a0dc010058ee01002ef7010090dc01004cee010088dc010046ee010084dc010082dc0100a098010058cc01002ee60100a0b90100909801006eee010090b90100ccdc010046cc010088b901008498010084b901008298010082b90100a0100100588801002ec40100a0310100901001004c880100a073010090310100cc9801004688010090730100ccb901008410010088730100843101008210010082310100d81001006e880100d8310100cc100100d8730100cc310100c6100100cc730100c6310100ee100100ee73010050dc01002cee010048dc010026ee010044dc010042dc0100509801002ccc0100d0b801004898010026cc0100c8b8010066dc0100c4b8010042980100c2b80100501001002c880100d03001004810010026880100d0710100c830010066980100c8710100e6b8010042100100c4710100c2300100c2710100ec300100ec710100e671010016ee010022dc010016cc010024980100229801002810010068300100e8700100221001006230010060850100400a010030850100200a0100188501008ec20100100a01000c850100080a010006850100600b0100b8850100dec20100300b01009c850100180b01008e8501000c0b0100060b0100b80b0100de8501009c0b01008e0b0100de0b0100408d0100b0c601005ce30100208d010098c60100108d01008cc60100088d010086c60100048d010040090100b08401005cc20100401b010020090100dcc601004ec20100201b0100988d0100cec60100101b01000809010086840100081b0100868d010002090100b0090100dc840100b01b010098090100ce840100981b0100ce8d01008c1b010086090100dc090100dc1b0100ce090100ce1b0100a0ce010058e70100aef3010090ce01004ce7010088ce010046e7010084ce010082ce0100a08c010058c60100a09d0100908c01004cc60100909d0100ccce010046c60100889d0100848c0100849d0100828c0100829d0100a008010058840100a0190100900801006ec60100a03b010090190100cc8c010046840100903b0100cc9d010084080100883b0100841901008208010082190100d80801006e840100d8190100cc080100d83b0100cc190100c6080100cc3b0100c6190100ee080100ee190100ee3b010050ef0100acf7010048ef0100a6f7010044ef010042ef010050ce01002ce70100d0de01006cef010026e70100c8de010066ef0100c4de010042ce0100c2de0100508c01002cc60100d09c0100488c010026c60100d0bd0100c89c010066ce0100c8bd0100e6de0100428c0100c4bd0100c29c0100c2bd0100500801002c840100d01801004808010026840100d0390100c8180100668c0100d07b0100c8390100e69c010042080100c87b0100e6bd0100c2180100c47b01006c080100ec18010066080100ec390100e6180100ec7b0100e6390100e67b010028ef010096f7010024ef010022ef010028ce010016e7010068de010036ef010064de010022ce010062de0100288c010016c60100689c0100248c0100e8bc0100649c0100228c0100e4bc0100629c0100e2bc0100280801001684010068180100368c0100e83801006418010022080100e8790100e438010062180100e4790100e2380100e279010076180100f679010012ef010034de010032de0100349c010074bc010072bc01003418010074380100f4780100f2780100400501002005010098820100100501000805010004050100b0050100980501008c05010086050100dc050100ce050100a0860100908601004cc301008886010046c301008486010082860100a004010058820100a00d0100d88601004c820100900d0100cc860100880d0100c6860100840d010082040100820d0100d80401006e820100d80d0100ee860100cc0d0100c6040100c60d0100ee040100ee0d010050c7010048c7010044c7010042c7010050860100d08e01006cc7010026c30100c88e010066c70100c48e010042860100c28e010050040100d00c01004804010026820100d01d0100c80c010044040100c81d0100c40c010042040100c41d0100c20c01006c040100ec0c010066040100ec1d0100e60c0100e61d0100a8e70100a4e70100a2e7010028c7010068cf0100b6e7010064cf010022c7010062cf01002886010016c30100688e010036c70100e89e0100648e010022860100e49e0100628e0100e29e01002804010016820100680c010036860100e81c0100640c010022040100e83d0100e41c0100620c0100e43d0100e21c010036040100760c0100f61c0100f63d0100d4f70100d2f7010094e70100b4ef010092e70100b2ef010014c7010034cf010012c7010074df010032cf010072df010014860100348e010012860100749e0100328e0100f4be0100"), $d2j$hex$bfb02706$decode_I("60f50100b8fa010040ea010030f501009cfa010020ea010018f501008efa010010ea01000cf5010008ea010006f5010004ea010060eb0100b8f50100defa010040d6010030eb01009cf5010020d6010018eb01008ef5010010d601000ceb010008d6010006eb010004d6010060d70100b8eb0100def5010040ae010030d701009ceb010020ae010018d701008eeb010010ae01000cd7010008ae010006d7010004ae010060af0100b8d70100deeb0100405e010030af01009cd70100205e010018af01008ed70100105e01000caf0100085e010006af0100605f0100b8af0100ded70100305f01009caf0100185f01008eaf01000c5f0100b85f0100deaf01009c5f01008e5f010040e90100b0f401005cfa010020e9010098f401004efa010010e901008cf4010008e9010086f4010004e9010002e9010040d30100b0e90100dcf4010020d3010098e90100cef4010010d301008ce9010008d3010086e9010004d3010002d3010040a70100b0d30100dce9010020a7010098d30100cee9010010a701008cd3010008a7010086d3010004a7010002a70100404f0100b0a70100dcd30100204f010098a70100ced30100104f01008ca70100084f010086a70100044f0100b04f0100dca70100984f0100cea701008c4f0100864f0100dc4f0100ce4f0100a0e8010058f401002efa010090e801004cf4010088e8010046f4010084e8010082e80100a0d10100d8e801006ef4010090d10100cce8010088d10100c6e8010084d1010082d10100a0a30100d8d10100eee8010090a30100ccd1010088a30100c6d1010084a3010082a30100a0470100d8a30100eed1010090470100cca3010088470100c6a301008447010082470100d8470100eea30100cc470100c6470100ee47010050e801002cf4010048e8010026f4010044e8010042e80100d0d001006ce80100c8d0010066e80100c4d00100c2d00100d0a10100ecd00100c8a10100e6d00100c4a10100c2a10100d0430100eca10100c8430100e6a10100c4430100c2430100ec430100e643010028e8010016f4010024e8010022e8010068d0010036e8010064d0010062d00100e8a0010076d00100e4a00100e2a00100e8410100f6a00100e4410100e241010014e8010012e8010034d0010032d0010074a0010072a0010040e50100b0f201005cf9010020e5010098f201004ef9010010e501008cf2010008e5010086f2010004e5010002e5010040cb0100b0e50100dcf2010020cb010098e50100cef2010010cb01008ce5010008cb010086e5010004cb010002cb010040970100b0cb0100dce501002097010098cb0100cee50100109701008ccb01000897010086cb01000497010002970100402f0100b0970100dccb0100202f010098970100cecb0100102f01008c970100082f010086970100042f0100b02f0100dc970100982f0100ce9701008c2f0100862f0100dc2f0100ce2f0100a0f6010058fb0100f06b010090f601004cfb0100f869010088f6010046fb0100fc68010084f6010082f60100a0e4010058f201002ef90100a0ed010090e401006efb010090ed0100ccf6010046f2010088ed010084e4010084ed010082e4010082ed0100a0c90100d8e401006ef20100a0db010090c90100cce4010090db0100cced0100c6e4010088db010084c9010084db010082c9010082db0100a0930100d8c90100eee40100a0b7010090930100ccc9010090b70100ccdb0100c6c9010088b701008493010084b701008293010082b70100a0270100d8930100eec90100a06f010090270100cc930100906f0100ccb70100c6930100886f010084270100846f010082270100d8270100ee930100d86f0100cc270100cc6f0100c6270100c66f0100ee27010050f601002cfb0100f865010048f6010026fb0100fc64010044f601007e64010042f6010050e401002cf20100d0ec010048e4010026f20100c8ec010066f60100c4ec010042e40100c2ec0100d0c801006ce40100d0d90100c8c8010066e40100c8d90100e6ec0100c4d90100c2c80100c2d90100d0910100ecc80100d0b30100c8910100e6c80100c8b30100e6d90100c4b30100c2910100c2b30100d0230100ec910100d0670100c8230100e6910100c8670100e6b30100c4670100c2230100c2670100ec230100ec670100e6230100e667010028f6010016fb0100fc62010024f601007e62010022f6010028e4010016f2010068ec010036f6010064ec010022e4010062ec010068c8010036e40100e8d8010064c80100e4d8010062c80100e2d80100e890010076c80100e8b10100f6d80100e4b10100e2900100e2b10100e8210100f6900100e8630100e4210100e4630100e2210100e2630100f6210100f663010014f601007e61010012f6010014e4010034ec010012e4010032ec010034c8010074d8010032c8010072d8010074900100f4b0010072900100f2b00100f4200100f4610100f2200100f26101000af601000ae401001aec01001ac801003ad801003a9001007ab00100a0e2010058f10100aef8010090e201004cf1010088e2010046f1010084e2010082e20100a0c50100d8e201006ef1010090c50100cce2010088c50100c6e2010084c5010082c50100a08b0100d8c50100eee20100908b0100ccc50100888b0100c6c50100848b0100828b0100a0170100d88b0100eec5010090170100cc8b010088170100c68b01008417010082170100d8170100ee8b0100cc170100c6170100ee17010050f30100acf90100f835010048f30100a6f90100fc34010044f301007e34010042f3010050e201002cf10100d0e6010048e2010026f10100c8e6010066f30100c4e6010042e20100c2e60100d0c401006ce20100d0cd0100c8c4010066e20100c8cd0100e6e60100c4cd0100c2c40100c2cd0100d0890100ecc40100d09b0100c8890100e6c40100c89b0100e6cd0100c49b0100c2890100c29b0100d0130100ec890100d0370100c8130100e6890100c8370100e69b0100c4370100c2130100c2370100ec130100ec370100e6130100e6370100a8fb0100f0750100fcba0100a4fb0100f87401007eba0100a2fb01007c7401003e74010028f3010096f90100fc32010068f70100b6fb0100fc7601007e32010064f7010022f301007e76010062f7010028e2010016f1010068e6010024e20100e8ee010076f7010022e20100e4ee010062e60100e2ee010068c4010036e20100e8cc010064c40100e8dd0100e4cc010062c40100e4dd0100e2cc0100e2dd0100e888010076c40100e8990100e4880100e8bb0100e4990100e2880100e4bb0100e2990100e2bb0100e8110100f6880100e8330100e4110100e8770100e4330100e2110100e4770100e2330100e2770100f6110100f633010094fb0100f87201007eb9010092fb01007c7201003e72010014f301007e31010034f7010012f301007e73010032f7010014e2010034e6010012e2010074ee010032e6010072ee010034c4010074cc010032c40100f4dc010072cc0100f2dc010074880100f498010072880100f4b90100f2980100f2b90100f4100100f4310100f2100100f4730100f2310100f27301008afb01007c7101003e7101000af301001af701000ae201001ae601003aee01001ac401003acc01007adc01003a8801007a980100fab801007a100100fa300100fa710100be70010050e10100acf0010048e10100a6f0010044e1010042e10100d0c201006ce10100c8c2010066e10100c4c20100c2c20100d0850100ecc20100c8850100e6c20100c4850100c2850100d00b0100ec850100c80b0100e6850100c40b0100c20b0100ec0b0100e60b0100a8f10100d6f80100fc1a0100a4f101007e1a0100a2f1010028e1010096f0010068e3010024e1010064e3010022e1010062e3010068c2010036e10100e8c6010064c20100e4c6010062c20100e2c60100e884010076c20100e88d0100e4840100e48d0100e2840100e28d0100e8090100f6840100e81b0100e4090100e41b0100e2090100e21b0100f6090100f61b0100d4f90100f83a01007e9d0100d2f901007c3a01003e3a010094f101007e190100b4f3010092f101007e3b0100b2f3010014e1010034e3010012e1010074e7010032e3010072e7010034c2010074c6010032c20100f4ce010072c60100f2ce010074840100f48c010072840100f49d0100f28c0100f29d0100f4080100f4190100f2080100f43b0100f2190100f23b0100f07a01007cbd0100787a01003ebd01003c7a01001e7a0100caf901007c390100dafb01007c7b01003e3901003e7b01008af101009af30100baf701000ae101001ae301003ae701007aef01001ac201003ac601007ace0100fade01003a8401007a8c0100fa9c0100fabd01007a080100fa180100fa39010078790100bebc01003c7901001e790100be380100be790100bc7801009e7801005e780100a8e00100a4e00100a2e0010068c10100b6e0010064c1010062c10100e882010076c10100e4820100e2820100e8050100f6820100e4050100e2050100f6050100d4f001007e0d0100d2f0010094e00100b4e1010092e00100b2e1010034c1010074c3010032c1010072c3010074820100f486010072820100f2860100f4040100f40d0100f2040100f20d0100eaf801007c1d01003e1d0100caf00100daf101008ae001009ae10100bae301001ac101003ac301007ac701003a8201007a860100fa8e01007a040100fa0c0100fa1d0100783d0100be9e01003c3d01001e3d0100be1c0100be3d0100707d0100bcbe0100387d01009ebe01001c7d01000e7d0100bc3c0100bc7d01009e3c01009e7d0100b87c01005ebe01009c7c01008e7c01005e3c0100de7c01005c7c01004e7c01002e7c0100b4c00100b2c001007481010072810100f4020100f2020100dae001009ac00100bac101003a8101007a8301007a020100fa060100be0e0100bc1e01009e1e0100b83e01005e9f01009c3e01008e3e01005e1e0100de3e0100b07e01005cbf0100987e01004ebf01008c7e0100867e01005c3e0100dc7e01004e3e0100ce7e0100587e01002ebf01004c7e0100467e01002e3e01006e7e01002c7e0100267e01005e0f01005c1f01004e1f0100583f0100ae9f01004c3f0100463f01002e1f01006e3f01002c3f0100263f0100"), $d2j$hex$bfb02706$decode_I("e0ab0100f8d50100c0530100f0a90100fcd40100e0510100f8a801007ed40100f05001007ca8010078500100d0fa0100e05b0100f8ad0100c8fa0100f0590100fcac0100c4fa0100f85801007eac0100c2fa01007c580100d0f50100ecfa0100f85d0100c8f50100e6fa0100fc5c0100c4f501007e5c0100c2f50100d0eb0100ecf50100c8eb0100e6f50100c4eb0100c2eb0100d0d70100eceb0100c8d70100e6eb0100c4d70100c2d70100d0af0100ecd70100c8af0100e6d70100c4af0100c04b0100f0a50100fcd20100e0490100f8a401007ed20100f04801007ca40100784801003ea401003c48010068fa0100f04d0100fca6010064fa0100f84c01007ea6010062fa01007c4c01003e4c0100e8f4010076fa0100fc4e0100e4f401007e4e0100e2f40100e8e90100f6f40100e4e90100e2e90100e8d30100f6e90100e4d30100e2d30100e8a70100f6d30100e4a70100e2a70100e0450100f8a201007ed10100f04401007ca20100784401003ea201003c4401001e44010034fa0100f84601007ea3010032fa01007c4601003e46010074f401007e47010072f40100f4e80100f2e80100f4d10100f2d10100f4a30100f2a30100f04201007ca10100784201003ea101003c4201001e4201001afa01007c4301003e4301003af401007ae80100fad0010078410100bea001003c4101001e410100be410100bc4001009e400100c02b0100f0950100fcca0100e0290100f89401007eca0100f02801007c940100782801003e9401003c28010068f90100f02d0100fc96010064f90100f82c01007e96010062f901007c2c01003e2c0100e8f2010076f90100fc2e0100e4f201007e2e0100e2f20100e8e50100f6f20100e4e50100e2e50100e8cb0100f6e50100e4cb0100e2cb0100e8970100f6cb0100e4970100e2970100e0b50100f8da01007eed0100c0690100f0b401007cda0100e068010078b401003eda0100706801003cb40100386801001eb401001c680100e0250100f89201007ec90100e06d0100f02401007c920100f06c01007cb601003e920100786c01003c2401003c6c01001e2401001e6c010034f90100f82601007e93010074fb010032f90100f86e01007c26010072fb01007c6e01003e2601003e6e010074f201007e270100f4f6010072f201007e6f0100f2f60100f4e40100f4ed0100f2e40100f2ed0100f4c90100f4db0100f2c90100f2db0100f4930100f2930100c0650100f0b201007cd90100e064010078b201003ed90100706401003cb20100386401001eb201001c6401000e640100f02201007c910100f0660100782201003e910100786601003eb301003c6601001e2201001e6601001af901007c2301003afb01007c6701003e2301003e6701003af201007af601007ae40100faec0100fac80100fad90100fa910100e062010078b10100bed80100706201003cb10100386201001eb101001c6201000e62010078210100be900100786301003c2101003c6301001e2101001e630100be210100be63010070610100bcb00100386101009eb001001c6101000e610100bc200100bc6101009e2001009e610100b86001005eb001009c6001008e6001005e200100de6001005c6001004e600100e0150100f88a01007ec50100f01401007c8a0100781401003e8a01003c1401001e140100b4f80100f81601007e8b0100b2f801007c1601003e16010074f101007e17010072f10100f4e20100f2e20100f4c50100f2c50100f48b0100f28b0100c0350100f09a01007ccd0100e0340100789a01003ecd0100703401003c9a0100383401001e9a01001c3401000e340100f01201007c890100f0360100781201003e890100783601003e9b01003c3601001e1201001e3601009af801007c130100baf901007c3701003e1301003e3701003af101007af301007ae20100fae60100fac40100facd0100fa890100e0ba010078dd0100beee0100c074010070ba01003cdd01006074010038ba01001edd0100307401001cba0100187401000eba01000c740100e032010078990100becc0100e0760100703201003c990100707601003cbb01001e990100387601001c3201001c7601000e3201000e76010078110100be880100783301003c110100787701003c3301001e1101003c7701001e3301001e770100be110100be330100be770100c072010070b90100bcdc01006072010038b901009edc0100307201001cb90100187201000eb901000c7201000672010070310100bc98010070730100383101009e980100387301009eb901001c7301000e3101000e730100bc100100bc3101009e100100bc7301009e3101009e73010060710100b8b801005edc0100307101009cb80100187101008eb801000c71010006710100b83001005e980100b87101009c3001009c7101008e3001008e7101005e100100de300100de710100b07001005cb80100987001004eb801008c700100867001005c300100dc7001004e300100ce700100587001002eb801004c700100467001002e3001006e7001002c70010026700100f00a01007c850100780a01003e8501003c0a01001e0a01007c0b01003e0b0100baf001007ae10100fac20100fa850100e01a0100788d0100bec60100701a01003c8d0100381a01001e8d01001c1a01000e1a010078090100be840100781b01003c0901003c1b01001e0901001e1b0100be090100be1b0100c03a0100709d0100bcce0100603a0100389d01009ece0100303a01001c9d0100183a01000e9d01000c3a0100063a010070190100bc8c0100703b0100381901009e8c0100383b01001c1901001c3b01000e1901000e3b0100bc080100bc1901009e080100bc3b01009e1901009e3b010060bd0100b8de01005eef0100407a010030bd01009cde0100207a010018bd01008ede0100107a01000cbd0100087a010006bd0100047a010060390100b89c01005ece0100607b0100303901009c9c0100307b01009cbd01008e9c0100187b01000c3901000c7b010006390100067b0100b81801005e8c0100b83901009c180100b87b01009c3901008e1801009c7b01008e3901008e7b01005e080100de180100de390100de7b010040790100b0bc01005cde01002079010098bc01004ede0100107901008cbc01000879010086bc01000479010002790100b03801005c9c0100b0790100983801004e9c010098790100cebc01008c79010086380100867901005c180100dc3801004e180100dc790100ce380100ce790100a078010058bc01002ede0100907801004cbc01008878010046bc01008478010082780100583801002e9c0100d87801004c380100cc78010046380100c67801002e1801006e380100ee780100507801002cbc01004878010026bc010044780100427801002c3801006c78010026380100667801002878010016bc01002478010022780100163801003678010078050100be8201003c0501001e050100be050100700d0100bc860100380d01009e8601001c0d01000e0d0100bc040100bc0d01009e0401009e0d0100601d0100b88e01005ec70100301d01009c8e0100181d01008e8e01000c1d0100061d0100b80c01005e860100b81d01009c0c01009c1d01008e0c01008e1d01005e040100de0c0100de1d0100403d0100b09e01005ccf0100203d0100989e01004ecf0100103d01008c9e0100083d0100869e0100043d0100023d0100b01c01005c8e0100b03d0100981c01004e8e0100983d0100ce9e01008c3d0100861c0100863d01005c0c0100dc1c01004e0c0100dc3d0100ce1c0100ce3d0100a0be010058df0100aeef010090be01004cdf010088be010046df010084be010082be0100a03c0100589e01002ecf0100a07d0100903c01004c9e0100907d0100ccbe0100469e0100887d0100843c0100847d0100823c0100827d0100581c01002e8e0100d83c01004c1c0100d87d0100cc3c0100461c0100cc7d0100c63c0100c67d01002e0c01006e1c0100ee3c0100ee7d010050be01002cdf010048be010026df010044be010042be0100503c01002c9e0100d07c0100483c0100269e0100c87c010066be0100c47c0100423c0100c27c01002c1c01006c3c0100261c0100ec7c0100663c0100e67c010028be010016df010024be010022be0100283c0100169e0100687c0100243c0100647c0100223c0100627c0100161c0100363c0100767c010014be010012be0100143c0100347c0100123c0100327c0100bc0201009e020100b80601005e8301009c0601008e0601005e020100de060100b00e01005c870100980e01004e8701008c0e0100860e01005c060100dc0e01004e060100ce0e0100a01e0100588f0100aec70100901e01004c8f0100881e0100468f0100841e0100821e0100580e01002e870100d81e01006e8f0100cc1e0100460e0100c61e01002e0601006e0e0100ee1e0100509f0100accf0100489f0100a6cf0100449f0100429f0100501e01002c8f0100d03e01006c9f0100268f0100c83e0100441e0100c43e0100421e0100c23e01002c0e01006c1e0100260e0100ec3e0100661e0100e63e0100a8df0100d6ef0100a4df0100a2df0100289f010096cf010068bf0100249f010064bf0100229f010062bf0100281e0100168f0100683e0100241e0100e87e0100643e0100221e0100e47e0100623e0100e27e0100160e0100361e0100763e0100f67e010094df010092df0100149f010034bf0100129f010032bf0100141e0100343e0100121e0100747e0100323e0100727e01008adf01000a9f01001abf01000a1e01001a3e01003a7e01005c0301004e03010058070100ae8301004c070100460701002e0301006e070100500f0100ac870100480f0100a6870100440f0100420f01002c0701006c0f010026070100660f0100a88f0100d6c70100a48f0100a28f0100280f010096870100681f0100b68f0100641f0100220f0100621f010016070100360f0100761f0100d4cf0100d2cf0100948f0100b49f0100928f0100b29f0100140f0100341f0100120f0100743f0100321f0100723f0100cacf01008a8f01009a9f01000a0f01001a1f01003a3f0100ac030100a6030100a8070100d6830100a4070100a207010096030100b6070100d4870100d287010094070100b40f010092070100b20f0100eac70100")};
    private BarcodeMatrix barcodeMatrix;
    private boolean compact;
    private Compaction compaction;
    private Charset encoding;
    private int maxCols;
    private int maxRows;
    private int minCols;
    private int minRows;

    public PDF417() {
        this(false);
    }

    public PDF417(boolean z) {
        this.compact = z;
        this.compaction = Compaction.AUTO;
        this.encoding = null;
        this.minCols = 2;
        this.maxCols = 30;
        this.maxRows = 30;
        this.minRows = 2;
    }

    private static int calculateNumberOfRows(int i, int i2, int i3) {
        int i4 = i + 1 + i2;
        int i5 = i4 / i3;
        int i6 = i5 + 1;
        if (i3 * i6 >= i4 + i3) {
            i6 = i5;
        }
        return i6;
    }

    private int[] determineDimensions(int i, int i2) {
        int[] iArr;
        int calculateNumberOfRows;
        int i3 = this.minCols;
        float f = 0.0f;
        int[] iArr2 = null;
        while (true) {
            iArr = iArr2;
            if (i3 > this.maxCols || (calculateNumberOfRows = calculateNumberOfRows(i, i2, i3)) < this.minRows) {
                break;
            }
            float f2 = f;
            int[] iArr3 = iArr;
            if (calculateNumberOfRows <= this.maxRows) {
                float f3 = (((i3 * 17) + 69) * 0.357f) / (calculateNumberOfRows * 2.0f);
                if (iArr != null) {
                    f2 = f;
                    iArr3 = iArr;
                    if (Math.abs(f3 - 3.0f) > Math.abs(f - 3.0f)) {
                    }
                }
                iArr3 = new int[]{i3, calculateNumberOfRows};
                f2 = f3;
            }
            i3++;
            f = f2;
            iArr2 = iArr3;
        }
        int[] iArr4 = iArr;
        if (iArr == null) {
            int calculateNumberOfRows2 = calculateNumberOfRows(i, i2, this.minCols);
            int i4 = this.minRows;
            iArr4 = iArr;
            if (calculateNumberOfRows2 < i4) {
                iArr4 = new int[]{this.minCols, i4};
            }
        }
        if (iArr4 != null) {
            return iArr4;
        }
        throw new WriterException("Unable to fit message in columns");
    }

    private static void encodeChar(int i, int i2, BarcodeRow barcodeRow) {
        int i3 = 1 << (i2 - 1);
        boolean z = (i & i3) != 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z2 = z;
            if (i4 >= i2) {
                barcodeRow.addBar(z2, i5);
                return;
            }
            z = (i & i3) != 0;
            if (z2 == z) {
                i5++;
                z = z2;
            } else {
                barcodeRow.addBar(z2, i5);
                i5 = 1;
            }
            i3 >>= 1;
            i4++;
        }
    }

    private void encodeLowLevel(CharSequence charSequence, int i, int i2, int i3, BarcodeMatrix barcodeMatrix) {
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = i8 % 3;
            barcodeMatrix.startRow();
            encodeChar(130728, 17, barcodeMatrix.getCurrentRow());
            if (i9 == 0) {
                i5 = (i8 / 3) * 30;
                i4 = ((i2 - 1) / 3) + i5;
                i6 = i - 1;
            } else if (i9 == 1) {
                i5 = (i8 / 3) * 30;
                int i10 = i2 - 1;
                i4 = (i3 * 3) + i5 + (i10 % 3);
                i6 = i10 / 3;
            } else {
                int i11 = (i8 / 3) * 30;
                i4 = (i - 1) + i11;
                i5 = i11 + (i3 * 3);
                i6 = (i2 - 1) % 3;
            }
            encodeChar(CODEWORD_TABLE[i9][i4], 17, barcodeMatrix.getCurrentRow());
            for (int i12 = 0; i12 < i; i12++) {
                encodeChar(CODEWORD_TABLE[i9][charSequence.charAt(i7)], 17, barcodeMatrix.getCurrentRow());
                i7++;
            }
            if (this.compact) {
                encodeChar(260649, 1, barcodeMatrix.getCurrentRow());
            } else {
                encodeChar(CODEWORD_TABLE[i9][i5 + i6], 17, barcodeMatrix.getCurrentRow());
                encodeChar(260649, 18, barcodeMatrix.getCurrentRow());
            }
        }
    }

    private static int getNumberOfPadCodewords(int i, int i2, int i3, int i4) {
        int i5 = (i3 * i4) - i2;
        if (i5 > i + 1) {
            return (i5 - i) - 1;
        }
        return 0;
    }

    public void generateBarcodeLogic(String str, int i) {
        int errorCorrectionCodewordCount = PDF417ErrorCorrection.getErrorCorrectionCodewordCount(i);
        String encodeHighLevel = PDF417HighLevelEncoder.encodeHighLevel(str, this.compaction, this.encoding);
        int length = encodeHighLevel.length();
        int[] determineDimensions = determineDimensions(length, errorCorrectionCodewordCount);
        int i2 = determineDimensions[0];
        int i3 = determineDimensions[1];
        int numberOfPadCodewords = getNumberOfPadCodewords(length, errorCorrectionCodewordCount, i2, i3);
        if (errorCorrectionCodewordCount + length + 1 > 929) {
            throw new WriterException("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
        }
        int i4 = length + numberOfPadCodewords + 1;
        StringBuilder sb = new StringBuilder(i4);
        sb.append((char) i4);
        sb.append(encodeHighLevel);
        for (int i5 = 0; i5 < numberOfPadCodewords; i5++) {
            sb.append((char) 900);
        }
        String sb2 = sb.toString();
        String generateErrorCorrection = PDF417ErrorCorrection.generateErrorCorrection(sb2, i);
        this.barcodeMatrix = new BarcodeMatrix(i3, i2);
        encodeLowLevel(sb2 + generateErrorCorrection, i2, i3, i, this.barcodeMatrix);
    }

    public BarcodeMatrix getBarcodeMatrix() {
        return this.barcodeMatrix;
    }

    public void setCompact(boolean z) {
        this.compact = z;
    }

    public void setCompaction(Compaction compaction) {
        this.compaction = compaction;
    }

    public void setEncoding(Charset charset) {
        this.encoding = charset;
    }

    private static long[] $d2j$hex$bfb02706$decode_J(String src) {
        byte[] d = $d2j$hex$bfb02706$decode_B(src);
        ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s = b.asLongBuffer();
        long[] data = new long[d.length / 8];
        s.get(data);
        return data;
    }

    private static int[] $d2j$hex$bfb02706$decode_I(String src) {
        byte[] d = $d2j$hex$bfb02706$decode_B(src);
        ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s = b.asIntBuffer();
        int[] data = new int[d.length / 4];
        s.get(data);
        return data;
    }

    private static short[] $d2j$hex$bfb02706$decode_S(String src) {
        byte[] d = $d2j$hex$bfb02706$decode_B(src);
        ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s = b.asShortBuffer();
        short[] data = new short[d.length / 2];
        s.get(data);
        return data;
    }

    private static byte[] $d2j$hex$bfb02706$decode_B(String src) {
        int hh;
        int i;
        char[] d = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i2 = 0; i2 < ret.length; i2++) {
            char h = d[2 * i2];
            char l = d[(2 * i2) + 1];
            if (h >= '0' && h <= '9') {
                hh = h - '0';
            } else if (h >= 'a' && h <= 'f') {
                hh = (h - 'a') + 10;
            } else if (h >= 'A' && h <= 'F') {
                hh = (h - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            if (l >= '0' && l <= '9') {
                i = l - '0';
            } else if (l >= 'a' && l <= 'f') {
                i = (l - 'a') + 10;
            } else if (l >= 'A' && l <= 'F') {
                i = (l - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            int ll = i;
            ret[i2] = (byte) ((hh << 4) | ll);
        }
        return ret;
    }
}
